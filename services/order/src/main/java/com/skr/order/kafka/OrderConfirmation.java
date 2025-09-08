package com.skr.order.kafka;

import com.skr.order.base.PaymentMethod;
import com.skr.order.external.customer.CustomerResponse;
import com.skr.order.external.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
