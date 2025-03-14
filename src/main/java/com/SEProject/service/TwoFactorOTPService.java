package com.SEProject.service;

import com.SEProject.model.TwoFactorOTP;
import com.SEProject.model.User;

public interface TwoFactorOTPService {

    TwoFactorOTP createTwoFactorOTP(User user, String otp, String jwt);

    TwoFactorOTP findByUser(Long userId);
    TwoFactorOTP findById(String id);


    boolean verifyTwoFactorOTP(TwoFactorOTP twoFactorOTP, String otp);

    void deleteTwoFactorOTP(TwoFactorOTP twoFactorOTP);

}
/*
Purpose of TwoFactorOTPService
    This service interface is responsible for:
    Creating OTPs: Generating and storing OTPs for 2FA.
    Retrieving OTPs: Fetching OTP records by user or ID.
    Verifying OTPs: Validating OTPs provided by users during the 2FA process.
    Deleting OTPs: Removing OTP records after they are used or expired.
*/

