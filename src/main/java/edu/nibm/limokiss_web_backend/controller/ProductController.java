package edu.nibm.limokiss_web_backend.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.nibm.limokiss_web_backend.model.ProductDto;
import edu.nibm.limokiss_web_backend.service.ProdcutService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProdcutService prodcutService;
    private final ObjectMapper mapper;

    @PostMapping
    public ProductDto addNewProduct(@RequestBody ProductDto productDto) {
        return prodcutService.saveProduct(productDto);
    }

    @PutMapping("/{id}")
    public boolean updateProduct(@PathVariable int id, @RequestBody ProductDto productDto) {
        return prodcutService.updateProduct(id, productDto);
    }

    @GetMapping
    public List<ProductDto> getAllProduct() {
        return prodcutService.getAllProduct();
    }

    @GetMapping("/best")
    public List<ProductDto> getBestSellerProducts() {
        return prodcutService.getBestSellerProducts();
    }

}
