package com.skr.order.external.payment;


import com.skr.order.base.PaymentMethod;
import com.skr.order.external.customer.CustomerResponse;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}