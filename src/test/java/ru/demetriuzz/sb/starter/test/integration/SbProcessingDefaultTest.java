package ru.demetriuzz.sb.starter.test.integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.demetriuzz.sb.starter.service.SbProcessingService;

public class SbProcessingDefaultTest extends AbstractIntegrationTest {

    @Autowired(required = false)
    private SbProcessingService sbProcessingService;

    @Test
    @DisplayName("Запуск процесса с реализацией по умолчанию")
    void processing() {
        // нет реализации интерфейса
        Assertions.assertThat(sbProcessingService).isNull();
    }

}
