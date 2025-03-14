package com.vibhusha.userservice.model;


import com.vibhusha.userservice.enums.VerificationType;
import lombok.Data;


@Data
public class TwoFactorAuth {
    private boolean isEnabled= false;
    private VerificationType sendTo;

}
