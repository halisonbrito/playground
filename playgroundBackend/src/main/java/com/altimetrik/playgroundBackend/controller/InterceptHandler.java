package com.altimetrik.playgroundBackend.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.altimetrik.playgroundBackend.dto.ErrorDTO;
import com.altimetrik.playgroundBackend.dto.ErrorType;
import com.altimetrik.playgroundBackend.util.GeneralException;

@ControllerAdvice
public class InterceptHandler {

    @ExceptionHandler({Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ErrorDTO anyExceptionHandle(Exception ex){
        return new ErrorDTO("Server Error",ex.getMessage(), ErrorType.INTERNAL);
    }

    @ExceptionHandler({GeneralException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorDTO generalHandle(GeneralException ex){
        return new ErrorDTO(ex.getCustomMessage(),ex.getMessage(),ErrorType.GENERAL);
    }


}