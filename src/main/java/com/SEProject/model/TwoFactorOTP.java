package com.SEProject.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity //This annotation marks the class as a JPA entity, meaning it will be mapped to a database table.
@Data
public class TwoFactorOTP {
    @Id
    private String id;

    private String otp;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) //not included in the JSON response but can be used for internal processing.
    @OneToOne
    private User user;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String jwt;
}
/*
Purpose of the TwoFactorOTP Model
    This model is used to:
    Store OTPs generated for two-factor authentication.
    Associate the OTP with a specific user.
    Temporarily store a JWT (JSON Web Token) for the user during the 2FA process.
*/
