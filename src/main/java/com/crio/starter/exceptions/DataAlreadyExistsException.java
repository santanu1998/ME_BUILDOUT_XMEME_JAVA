package com.crio.starter.exceptions;

public class DataAlreadyExistsException extends Exception{

    @Override
    public String toString() {
        return "Duplicate data already exists!";
    }
}