package ru.my.mavenproject.utils.exception;

/**
 * Created by Nikolay on 24.06.2015.
 */

public class NotFoundException extends RuntimeException {
    public NotFoundException (String message){
        super(message);
    }
}
