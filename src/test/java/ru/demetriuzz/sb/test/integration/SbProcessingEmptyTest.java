package ru.demetriuzz.sb.test.integration;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import ru.demetriuzz.sb.service.SbProcessingService;

@Import({SbProcessingEmptyTest.EmptySbProcessingService.class})
public class SbProcessingEmptyTest extends AbstractIntegrationTest {

    @Autowired
    private SbProcessingService etl; // новая реализация интерфейса

    @Test
    @DisplayName("Запуск процесса с пустой реализацией")
    void processing() {
        Assertions.assertThat(etl).isNotNull();
        Assertions.assertThatCode(() -> {
            etl.init();
            etl.process();
        }).doesNotThrowAnyException();
    }

    @Slf4j
    public static class EmptySbProcessingService implements SbProcessingService {

        @Override
        public void init() {
            log.info("init");
        }

        @Override
        public void process() {
            log.info("process");
        }
    }

}
