package com.basketballapp.Exceptions;

/**
 * Created by plare on 10/4/2016.
 */
public class TeamNotValidException extends Exception {

    String message = null;

    public TeamNotValidException(){
        super();
    }

    public TeamNotValidException(String message){
        super(message);
        this.message = message;
    }

    public TeamNotValidException(Throwable throwable){
        super(throwable);
    }

    @Override
    public String toString() {
        return "Message is: " + message;
    }
}
