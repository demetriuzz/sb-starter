package ru.demetriuzz.sb.starter.service;

/**
 * Базовый интерфейс для запуска процесса
 */
public interface SbProcessingService {

    /**
     * Подготовка
     */
    default void prepare() {
    }

    /**
     * Запуск
     */
    void execute();

    /**
     * Завершение
     */
    default void complete() {
    }

}
