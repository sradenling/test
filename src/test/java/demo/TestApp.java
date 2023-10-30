package demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void testAppMessage() {
	var app = new App();
	assertEquals("The number is: ", app.getMessage());
    }
}
