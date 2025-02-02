package com.hammad.Command_snippet_API.Controller;


import com.hammad.Command_snippet_API.Domain.Dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorResponse> handleExceptions(RuntimeException ex , WebRequest request){
        ErrorResponse errorResponse = new ErrorResponse(
                HttpStatus.BAD_REQUEST.value(),
                ex.getMessage(),
                request.getDescription(false)

        );
        return  new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.BAD_REQUEST);
    }
}
