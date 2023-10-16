package Harshal_Day6_Assignment_part2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMonthlyPayment {


	@Test
	public void testTocalculateMonthlyPayment() {
        double monthlyPayment = MonthlyPayment.calculateMonthlyPayment(100000, 4, 2);
        assertEquals(1999.5131753084736, monthlyPayment, 0.01);

	}

}
