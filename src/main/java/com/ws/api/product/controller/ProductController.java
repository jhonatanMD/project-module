package com.ws.api.product.controller;

import com.ws.api.customer.ICustomerAdapter;
import com.ws.api.product.service.IProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping
@RequiredArgsConstructor
public class ProductController implements ProductApi{

    private final IProductService productService;
    private final ICustomerAdapter customerAdapter;
    //private final ICustomerService customerService;

    @Override
    public ResponseEntity<String> getProduct() {
        log.info(customerAdapter.customer().getName());
        return ResponseEntity.ok(productService.product());
    }

    @Override
    public ResponseEntity<List<String>> getProducts() {
        return ResponseEntity.ok(productService.products());
    }
}
