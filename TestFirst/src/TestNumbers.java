import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class TestNumbers {

//	@Test
	@RepeatedTest(value = 100)
	void testNumber() {
		Komponente data = new Komponente();

		assertTrue(data.getX() instanceof Number);
	}

	@RepeatedTest(value = 100)
	void testPositiv() {
		Komponente data = new Komponente();
		assertTrue((long) data.getX() > 0);
	}

	@RepeatedTest(value = 100)
	void testEven() {
		Komponente data = new Komponente();
		assertTrue((long) data.getX() % 2 == 0);
	}
}
