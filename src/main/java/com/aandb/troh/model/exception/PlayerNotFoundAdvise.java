package com.aandb.troh.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class PlayerNotFoundAdvise
{
    @ResponseBody
    @ExceptionHandler(PlayerNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String playerNotFoundHandler(PlayerNotFoundException e)
    {
        return e.getMessage();
    }
}
