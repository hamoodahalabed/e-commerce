package com.mohammad.ecommerce.payment;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
        name = "payment-service"
)
public interface PaymentClient {

    @PostMapping("/api/v1/payments")
    Integer requestOrderPayment(@RequestBody PaymentRequest request);
}