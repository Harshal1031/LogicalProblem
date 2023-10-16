package Harshal_Day6_Assignment_part2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestNumberTobinary {


	@Test
	public void test() {
		int res=NumberTobinary.tobinary(100);
		assertEquals(70, res);
 	}

}
