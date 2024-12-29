package edu.nibm.limokiss_web_backend.service;

import edu.nibm.limokiss_web_backend.model.ProductDto;

import java.util.List;

public interface ProdcutService {
    ProductDto saveProduct(ProductDto productDTO);
    List<ProductDto> getAllProduct();
    List<ProductDto>getBestSellerProducts();
    boolean updateProduct(Integer id, ProductDto productDto);

}
