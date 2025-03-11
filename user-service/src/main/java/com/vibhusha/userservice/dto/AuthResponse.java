package com.vibhusha.userservice.dto;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class AuthResponse {
    private String jwt;
    private boolean status;
    private String message;
    private boolean isTwoFactorAuthEnabled;
    private String session;
}
