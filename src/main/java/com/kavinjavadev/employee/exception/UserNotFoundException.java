package com.kavinjavadev.employee.exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(Long id){
        super("Couldn't found the employee with id "+id);
    }
}
