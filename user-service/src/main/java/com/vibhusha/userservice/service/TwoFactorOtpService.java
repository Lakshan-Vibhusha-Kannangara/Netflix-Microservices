package com.vibhusha.userservice.service;


import com.vibhusha.userservice.model.TwoFactorOTP;
import com.vibhusha.userservice.model.User;

public interface TwoFactorOtpService {
    TwoFactorOTP createTwoFactorOtp(User usr, String otp, String jwt);
    TwoFactorOTP findByUser(Long userId);
    TwoFactorOTP findById(String id);
    boolean verifyTwoFactorOtp(TwoFactorOTP twoFactorOTP, String otp);
    void deleteTwoFactorOtp(TwoFactorOTP twoFactorOTP);
}
