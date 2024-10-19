package ru.demetriuzz.sb.autoconfigure;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import ru.demetriuzz.sb.service.SbProcessingService;
import ru.demetriuzz.sb.service.impl.SbProcessingServiceImpl;

@AutoConfiguration
public class SbAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(SbProcessingService.class)
    public SbProcessingService etlProcessingService() {
        return new SbProcessingServiceImpl();
    }

}
