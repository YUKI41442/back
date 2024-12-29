package edu.nibm.limokiss_web_backend.repository;

import edu.nibm.limokiss_web_backend.entity.OrderEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderEntity,Integer> {
}
