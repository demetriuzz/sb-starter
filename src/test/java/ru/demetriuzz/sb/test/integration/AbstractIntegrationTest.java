package ru.demetriuzz.sb.test.integration;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;

@DirtiesContext
@SpringBootTest(classes = TestApplication.class)
@ActiveProfiles(profiles = "integration-test")
public abstract class AbstractIntegrationTest {
}
