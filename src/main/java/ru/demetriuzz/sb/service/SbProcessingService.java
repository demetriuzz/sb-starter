package ru.demetriuzz.sb.service;

/**
 * Базовый интерфейс для запуска процесса
 */
public interface SbProcessingService {

    /**
     * Подготовка к процессу, если необходимо (запускается первым)
     */
    default void init() {
    }

    /**
     * Запуск процесса (запускается после процесса подготовки)
     */
    void process();

}
