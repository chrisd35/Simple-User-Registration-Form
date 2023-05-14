package com.chris.BackendPortion.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

// handles the exceptions
@ControllerAdvice
public class UserNotFoundAdvice {

    // essentially, if you are experiencing the UserNotFoundException.class in the controller
    // then it will send a request to the Exception Handler
    @ResponseBody
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, String> exceptionHandler(UserNotFoundException exception){
        Map<String,String> error = new HashMap<>();
        error.put("This is an error!",exception.getMessage());

        return error;
    }
}
