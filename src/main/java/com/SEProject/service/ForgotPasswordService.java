package com.SEProject.service;

import com.SEProject.domain.VerificationType;
import com.SEProject.model.ForgotPasswordToken;
import com.SEProject.model.User;

public interface ForgotPasswordService {
    ForgotPasswordToken createToken(User user,
                                    String id, String otp,
                                    VerificationType verificationType,
                                    String sendTo);
    ForgotPasswordToken findById(String id);
    ForgotPasswordToken findByUser(Long userId);
    void deleteToken(ForgotPasswordToken token);
}
