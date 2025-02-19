package org.example.springboot_14.advisor;

import org.example.springboot_14.utill.ResponseUtill;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@CrossOrigin
public class AppWideExceptionhandler {
    @ExceptionHandler(Exception.class)
    public ResponseUtill exceptionHandler(Exception ex){
        return new ResponseUtill(500,"internal server Error",ex.getMessage());
    }
}
