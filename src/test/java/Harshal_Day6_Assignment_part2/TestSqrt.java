package Harshal_Day6_Assignment_part2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSqrt {


	@Test
	public void testSqrt() {
        double sqrt=  Sqrt.sqrt(100);
        assertEquals(10.0, sqrt, 0.01);

	}

}
