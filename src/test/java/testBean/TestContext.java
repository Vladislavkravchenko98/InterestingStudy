package testBean;

import config.Config;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
@Configuration
@Import(Config.class)
public class TestContext {

    @Test
    void getValue() {
    }
}
