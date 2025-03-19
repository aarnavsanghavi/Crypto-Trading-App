package com.SEProject.service;

import com.SEProject.model.PaymentDetails;
import com.SEProject.model.User;

public interface PaymentDetailsService {
    public PaymentDetails addPaymentDetails(String accountNumber,
                                            String accountHolderName,
                                            String ifsc,
                                            String bankName,
                                            User user);
    public PaymentDetails getUsersPaymentDetails(User user);
}
