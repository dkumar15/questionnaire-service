package com.questionnaire.exceptions.handler;

import com.questionnaire.exceptions.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler extends RuntimeException{

    @ExceptionHandler(UnableToSaveSubjectsException.class)
    public ResponseEntity<String> unableToSaveSubjectsException() {
        return new ResponseEntity<String>("Unable to save the subject(s)", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(SubjectIdNotFoundException.class)
    public ResponseEntity<String> subjectIdNotFoundException() {
        return new ResponseEntity<String>("SubjectId Not Found in Database, Please check and retry", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UnableToUpdateSubjectsException.class)
    public ResponseEntity<String> unableToUpdateSubjectsException() {
        return new ResponseEntity<String>("Unable to update subject, Please check and retry", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(SubjectPartIdNotFoundException.class)
    public ResponseEntity<String> SubjectPartIdNotFoundException() {
        return new ResponseEntity<String>("Subject id not found, Please check and retry", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UserNotRegisterException.class)
    public ResponseEntity<String> userNotRegisterException() {
        return new ResponseEntity<String>("User Not Registered, Please Register", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(RecordNotFoundException.class)
    public ResponseEntity<String> recordNotFoundException(){
        return new ResponseEntity<String>("Record Not Found, Please try after some time", HttpStatus.NOT_FOUND);
    }
}
