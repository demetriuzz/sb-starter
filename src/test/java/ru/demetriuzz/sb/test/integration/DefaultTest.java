package ru.demetriuzz.sb.test.integration;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

public class DefaultTest extends AbstractIntegrationTest {

    @Autowired
    private ConfigurableApplicationContext context;

    @Test
    @DisplayName("Проверка загрузки контекста приложения")
    void contextLoadTest() {
        Assertions.assertThat(context).isNotNull();
        final var beans = context.getBeanDefinitionNames();
        Assertions.assertThat(beans).isNotNull();
        Assertions.assertThat(beans.length).isGreaterThan(0);
        //printBeanInfo(beans);
    }

    private void printBeanInfo(String[] beans) {
        Arrays.sort(beans);
        Arrays.stream(beans).forEach(b -> {
            System.out.printf("-> %s [%s]%n", b, context.getBean(b).getClass().getName());
        });
    }

}
