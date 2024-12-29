package edu.nibm.limokiss_web_backend.repository;

import edu.nibm.limokiss_web_backend.model.OrderDto;
import edu.nibm.limokiss_web_backend.model.ProductDto;

import java.util.List;

public interface ProductJdbcRepository {

    int updateSizeQty(int qty, int productId, String name);
    List<OrderDto> getOrdersById(int id);
    List<ProductDto> getBestSellerProducts();
    void deleteNullProductId();
}
