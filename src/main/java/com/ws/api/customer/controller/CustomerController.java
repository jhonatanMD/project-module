package com.ws.api.customer.controller;

import com.ws.api.customer.service.ICustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class CustomerController implements CustomerApi{

    private final ICustomerService customerService;

    @Override
    public ResponseEntity<String> getCustomer() {
        return ResponseEntity.ok(customerService.customer());
    }

    @Override
    public ResponseEntity<List<String>> getCustomers() {
        return ResponseEntity.ok(customerService.customers());
    }
}
