package ru.demetriuzz.sb.autoconfigure;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import ru.demetriuzz.sb.service.SbProcessingService;
import ru.demetriuzz.sb.service.impl.SbProcessingServiceImpl;

@AutoConfiguration
@AutoConfigureAfter
public class SbAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(SbProcessingService.class)
    public SbProcessingService sbProcessingService() {
        return new SbProcessingServiceImpl();
    }

}
