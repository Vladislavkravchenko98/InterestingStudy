package testBean;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import services.TwoPhones;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = TestContext.class)
class TwoPhonesTest {

    @Autowired
    private TwoPhones twoPhones;

    @Test   //"prototype" - каждый раз новый бин
    void pressThisButtonFirst() {
        twoPhones.firstButtonPhoneFirst();
        Integer result = twoPhones.firstButtonPhoneSecond();
        assertEquals(result, 1);
    }

    @Test   //"singleton"  - один бин
    void pressThisButtonSecond() {
        twoPhones.secondtButtonPhoneFirst();
        Integer result = twoPhones.secondButtonPhoneSecond();
        assertEquals(result, 2);
    }
}