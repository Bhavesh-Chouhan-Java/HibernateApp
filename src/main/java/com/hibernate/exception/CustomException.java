package com.hibernate.exception;

public class CustomException extends RuntimeException{

    public CustomException(){
        super(" Hello world");
    }

    public CustomException(String str){
        super(str);
    }

}
