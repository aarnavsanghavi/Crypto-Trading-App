package com.SEProject.response;

import lombok.Data;

@Data
public class AuthResponse {

    private String jwt; // The JWT token
    private boolean status; // Indicates success or failure
    private String message; // Descriptive message
    private boolean isTwoFactorAuthEnabled; // Indicates if 2FA is enabled
    private String session; // Session identifier or token
}
/*
In Spring, the response package (or more accurately, the HttpServletResponse class and related components) plays a crucial role in handling
HTTP responses sent back to the client. It is part of the Java Servlet API and is used extensively in Spring applications to manage the
response data, headers, status codes, and more.*/

/*Purpose of AuthResponse
The AuthResponse class is designed to encapsulate the data that will be sent back to the client in response to authentication requests.
It typically includes:

    JWT: The JSON Web Token generated for the authenticated user.
    Status: A boolean flag indicating whether the authentication was successful.
    Message: A descriptive message (e.g., "Login successful" or "Invalid credentials").
    Two-Factor Authentication (2FA) Status: A boolean flag indicating whether 2FA is enabled for the user.
    Session: A session identifier or token (if applicable).

This class is used to standardize the structure of authentication
responses, making it easier for clients to parse and handle the data.
 */