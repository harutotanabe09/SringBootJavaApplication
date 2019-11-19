package spring.application.logic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest extends Calculator {

	@Test
	void 基本のテストケース() {
		assertEquals(2, add(1, 1));
	}

	@Test
	void 基本のテストケース２() {
		System.out.print("test start");
		assertEquals(4, add(2, 2));
	}

}
