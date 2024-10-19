package ru.demetriuzz.sb.test.integration;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

@DirtiesContext
@SpringBootTest(classes = TestApplication.class)
public abstract class AbstractIntegrationTest {
}
