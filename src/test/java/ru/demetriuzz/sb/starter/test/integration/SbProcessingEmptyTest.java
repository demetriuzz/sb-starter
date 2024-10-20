package ru.demetriuzz.sb.starter.test.integration;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import ru.demetriuzz.sb.starter.service.SbProcessingService;

@Import({SbProcessingEmptyTest.EmptySbProcessingService.class})
public class SbProcessingEmptyTest extends AbstractIntegrationTest {

    @Autowired(required = false)
    private SbProcessingService sbProcessingService; // реализация интерфейса

    @Test
    @DisplayName("Запуск процесса с пустой реализацией")
    void processing() {
        Assertions.assertThat(sbProcessingService).isNotNull();
        Assertions.assertThatCode(() -> {
            sbProcessingService.prepare();
            sbProcessingService.execute();
            sbProcessingService.complete();
        }).doesNotThrowAnyException();
    }

    @Slf4j
    public static class EmptySbProcessingService implements SbProcessingService {

        @Override
        public void execute() {
            log.info("execute");
        }

    }

}
