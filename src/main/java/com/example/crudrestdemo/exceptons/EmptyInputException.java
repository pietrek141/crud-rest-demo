package com.example.crudrestdemo.exceptons;

import lombok.Data;

@Data
public class EmptyInputException extends Exception{

    private String message;
    private String errorCode;

    public EmptyInputException(String message) {
        super(message);
        this.message = message;
    }


    public EmptyInputException(String message, String errorCode) {
        super(message);
        this.message = message;
        this.errorCode = errorCode;
    }

}
