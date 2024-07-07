package com.questionnaire.exceptions;

public class UserNotRegisterException extends RuntimeException{
    public UserNotRegisterException(String message) {
        super(message);
    }
}
