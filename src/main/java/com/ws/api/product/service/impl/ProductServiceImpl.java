package com.ws.api.product.service.impl;

import com.ws.api.product.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.ws.api.shared.util.Utils.print;

@Service
public class ProductServiceImpl implements IProductService {
    @Override
    public String product() {
        print();
        return "CELL";
    }

    @Override
    public List<String> products() {
        return List.of("CELL","TABLET","IPOD");
    }
}
