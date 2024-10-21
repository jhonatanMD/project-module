package com.ws.api.customer.service.impl;

import com.ws.api.customer.service.ICustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.ws.api.shared.util.Utils.print;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Override
    public String customer() {
        print();
        return "JUAN";
    }

    @Override
    public List<String> customers() {
        return List.of("JUAN","JULIO","DELIA");
    }
}
