package com.SEProject.service;

import com.SEProject.domain.PaymentMethod;
import com.SEProject.model.PaymentOrder;
import com.SEProject.model.User;
import com.SEProject.response.PaymentResponse;
import com.razorpay.RazorpayException;
import com.stripe.exception.StripeException;

public interface PaymentService {

    PaymentOrder createOrder(User user, Long amount,
                             PaymentMethod paymentMethod);
    PaymentOrder getPaymentOrderById(Long id);

    Boolean ProcceedPaymentOrder(PaymentOrder paymentOrder, String paymentId) throws RazorpayException;

    PaymentResponse createRazorpayPaymentLink(User user, Long amount) throws RazorpayException;

    PaymentResponse createStripePaymentLink(User user, Long amount, Long orderId) throws StripeException;
}
