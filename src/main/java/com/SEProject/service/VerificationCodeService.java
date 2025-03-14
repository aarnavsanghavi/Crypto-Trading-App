package com.SEProject.service;

import com.SEProject.domain.VerificationType;
import com.SEProject.model.User;
import com.SEProject.model.VerificationCode;

public interface VerificationCodeService {
    VerificationCode sendVerificationCode(User user, VerificationType verificationType);
    VerificationCode getVerificationCodeById(Long Id) throws Exception;
    VerificationCode getVerificationCodeByUser(Long userId);
    void deleteVerificationCodeById(VerificationCode verificationCode);
}
