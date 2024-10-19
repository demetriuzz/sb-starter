package ru.demetriuzz.sb.starter.autoconfigure;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import ru.demetriuzz.sb.starter.service.SbProcessingService;
import ru.demetriuzz.sb.starter.service.impl.SbProcessingServiceImpl;

@AutoConfiguration
@AutoConfigureAfter
public class SbStarterAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(SbProcessingService.class)
    public SbProcessingService sbProcessingService() {
        return new SbProcessingServiceImpl();
    }

}
