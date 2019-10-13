package greeter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingFormatterTest {
    @Test
    public void greetingTest() {
        assertEquals("Hello, yusuke", GreetingFormatter.greeting("yusuke"));
    }
}
