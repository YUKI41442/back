package edu.nibm.limokiss_web_backend.repository;

import edu.nibm.limokiss_web_backend.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserJpaRepository extends JpaRepository<UserEntity, Integer> {


    @Query(value = """
            SELECT 
                u.id AS userId, 
                u.name AS userName, 
                u.email AS userEmail, 
                SUM(od.qty) AS totalQuantity 
            FROM users u 
            JOIN orders o ON u.id = o.cus_id 
            JOIN order_details od ON o.id = od.order_id 
            GROUP BY u.id, u.name, u.email 
            ORDER BY totalQuantity DESC
            """,
            nativeQuery = true)
    List<Object[]> getCustomerOrderSummary();


}
