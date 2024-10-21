package com.ws.api.customer;
import com.ws.api.customer.service.ICustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomerAdapter implements ICustomerAdapter{

    private final ICustomerService customerService;
    @Override
    public CustomerDto customer() {
        return new CustomerDto(customerService.customer());
    }
}
