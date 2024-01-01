package com.gowithflow.springbootecommerce.service;

import com.gowithflow.springbootecommerce.dto.PaymentInfo;
import com.gowithflow.springbootecommerce.dto.Purchase;
import com.gowithflow.springbootecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;

}
