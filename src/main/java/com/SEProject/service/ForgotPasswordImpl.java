package com.SEProject.service;

import com.SEProject.domain.VerificationType;
import com.SEProject.model.ForgotPasswordToken;
import com.SEProject.model.User;
import com.SEProject.repository.ForgotPasswordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ForgotPasswordImpl implements ForgotPasswordService {

    @Autowired
    private ForgotPasswordRepository forgotpasswordRepository;


    @Override
    public ForgotPasswordToken createToken(User user, String id, String otp, VerificationType verificationType, String sendTo) {
        ForgotPasswordToken token = new ForgotPasswordToken();
        token.setUser(user);
        token.setSendTo(sendTo);
        token.setOtp(otp);
        token.setId(id);
        return forgotpasswordRepository.save(token);
    }

    @Override
    public ForgotPasswordToken findById(String id) {
        Optional<ForgotPasswordToken> token=forgotpasswordRepository.findById(id);
        return token.orElse(null);
    }

    @Override
    public ForgotPasswordToken findByUser(Long userId) {
        return forgotpasswordRepository.findByUserId(userId);
    }

    @Override
    public void deleteToken(ForgotPasswordToken token) {
        forgotpasswordRepository.delete(token);
    }
}
