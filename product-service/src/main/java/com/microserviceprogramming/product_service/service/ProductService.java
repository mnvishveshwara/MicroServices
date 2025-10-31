package com.microserviceprogramming.product_service.service;

import com.microserviceprogramming.product_service.dto.ProductDto;
import com.microserviceprogramming.product_service.dto.ProductResponse;
import com.microserviceprogramming.product_service.entity.Product;
import com.microserviceprogramming.product_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public void createProduct(ProductDto productDto) {

        Product product= Product.builder()
                .name(productDto.getName())
                .description(productDto.getDescription())
                .price(productDto.getPrice())
                .build();

        productRepository.save(product);
        log.info("Product {} has been created", product.getName());

    }

    public List<ProductResponse> getALlProduct() {

        List<Product> products = productRepository.findAll();
        return products.stream().map(this::mapToProductResponse).toList();

    }

    private ProductResponse mapToProductResponse(Product products) {
        return ProductResponse.builder()
                .id(products.getId())
                .name(products.getName())
                .description(products.getDescription())
                .price(products.getPrice())
                .build();
    }
}
