package demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdderTest {
    @Test void testAddNumbers() {
	var adder = new Adder();
	assertEquals(27, adder.addNumbers(3, 14, 4, 5, 1));
    }

    @Test void testAddNoNumbers() {
	var adder = new Adder();
	assertEquals(0, adder.addNumbers());
    }
}
