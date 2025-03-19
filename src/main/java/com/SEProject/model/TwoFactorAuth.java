package com.SEProject.model;
import com.SEProject.domain.VerificationType;
import lombok.Data;

@Data
public class TwoFactorAuth {

    private boolean isEnabled = true;
    private VerificationType sendTo;

}
