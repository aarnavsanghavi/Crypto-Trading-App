package com.SEProject.service;

import com.SEProject.domain.PaymentMethod;
import com.SEProject.model.PaymentOrder;
import com.SEProject.model.User;
import com.SEProject.response.PaymentResponse;

public interface PaymentService {

    PaymentOrder createOrder(User user, Long amount,
                             PaymentMethod paymentMethod);
    PaymentOrder getPaymentOrderById(Long id);

    Boolean ProcceedPaymentOrder(PaymentOrder paymentOrder, String paymentId);

    PaymentResponse createRazorpayPaymentList(User user, Long amount);
}
