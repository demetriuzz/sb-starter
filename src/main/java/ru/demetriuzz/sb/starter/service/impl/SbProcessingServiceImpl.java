package ru.demetriuzz.sb.starter.service.impl;

import lombok.extern.slf4j.Slf4j;
import ru.demetriuzz.sb.starter.service.SbProcessingService;

@Slf4j
public class SbProcessingServiceImpl implements SbProcessingService {

    public SbProcessingServiceImpl() {
        log.warn("Default SbProcessingService");
    }

    @Override
    public void process() {
        throw new TypeNotPresentException(SbProcessingService.class.getTypeName(), null);
    }

}
