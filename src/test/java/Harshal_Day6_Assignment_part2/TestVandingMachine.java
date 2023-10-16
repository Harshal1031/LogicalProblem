package Harshal_Day6_Assignment_part2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestVandingMachine {

	@Test
	public void testCalculateNotes() {
		int input1 = 100;
		int[] expected = { 0, 0, 0, 0, 0, 1, 0, 0 };
		int[] res = VendingMachine.calculateNotes(input1);
		assertArrayEquals(expected, res);

	}

}
