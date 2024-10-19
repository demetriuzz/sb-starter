package ru.demetriuzz.sb.starter.test.integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.demetriuzz.sb.starter.service.SbProcessingService;

public class SbProcessingDefaultTest extends AbstractIntegrationTest {

    @Autowired
    private SbProcessingService sbProcessingService;

    @Test
    @DisplayName("Запуск процесса с реализацией по умолчанию")
    void processing() {
        Assertions.assertThat(sbProcessingService).isNotNull();
        Assertions.assertThatCode(() -> sbProcessingService.init()).doesNotThrowAnyException();
        Assertions.assertThatThrownBy(() -> sbProcessingService.process()).isInstanceOf(TypeNotPresentException.class);
    }

}
