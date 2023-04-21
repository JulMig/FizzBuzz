package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	FizzBuzz fb;
	
	@BeforeEach
	void setUp() throws Exception {
		fb = new FizzBuzz();
	}

	@Test
	void premier_test() {
		assertEquals("1", fb.fizzBuzz(1));
	}
	
	@Test
	void test_fb2() {
		assertEquals("2", fb.fizzBuzz(2));
	}
	
	@Test
	void test_fb3() {
		assertEquals("fizz", fb.fizzBuzz(3));
	}
	
	@Test
	void test_fb_nombres() {
		assertEquals("4", fb.fizzBuzz(4));
		assertEquals("13", fb.fizzBuzz(13));
		assertEquals("400", fb.fizzBuzz(400));
	}
	
	@Test
	void test_fb5() {
		assertEquals("buzz", fb.fizzBuzz(5));
	}

}
