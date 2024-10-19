package ru.demetriuzz.sb.service;

/**
 * Базовое исключение процесса
 */
public class SbProcessingException extends RuntimeException {

    public SbProcessingException(String message) {
        super(message);
    }

}
