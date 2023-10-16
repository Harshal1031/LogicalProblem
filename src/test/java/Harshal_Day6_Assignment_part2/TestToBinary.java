package Harshal_Day6_Assignment_part2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestToBinary {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testToCheckBinaryOfGivenNumber() {
        String binary=ToBinary.toBinary(102);
        assertEquals("1100110", binary);
	}

}
