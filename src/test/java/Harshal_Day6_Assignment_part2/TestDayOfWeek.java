package Harshal_Day6_Assignment_part2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestDayOfWeek {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTestDayOfWeek() {
        String dayOfWeek = DayOfWeek.dayOfWeek(12,4,1995);
        assertEquals("Monday",dayOfWeek);
	}

}
