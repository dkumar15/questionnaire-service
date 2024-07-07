package com.questionnaire.exceptions;

public class SubjectIdNotFoundException extends RuntimeException{
    public SubjectIdNotFoundException(String message) {
        super(message);
    }
}
