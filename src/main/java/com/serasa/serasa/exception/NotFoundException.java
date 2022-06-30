package com.serasa.serasa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NO_CONTENT)
public class NotFoundException extends RuntimeException  {
    public NotFoundException(String exception) {
        super(exception);
    }

}
