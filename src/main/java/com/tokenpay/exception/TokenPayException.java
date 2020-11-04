package com.tokenpay.exception;

import lombok.Data;

@Data
public class TokenPayException extends RuntimeException {

    private final String errorCode;
    private final String errorDescription;
    private final String errorGroup;

    public TokenPayException(String errorCode, String errorDescription, String errorGroup) {
        super(errorDescription);
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
        this.errorGroup = errorGroup;
    }
}
