package Harshal_Day6_Assignment_part2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TemperaturConversionTest {



	@Test
	public void testCelsiusToFahrenheit() {
        double res = TemperaturConversion.celsiusToFahrenheit(100);
        System.out.println(res);
        assertEquals(212.0, res, 0.01);

	}
	@Test
	public void testFahrenheitToCelsius() {
        double res = TemperaturConversion.fahrenheitToCelsius(100);
        System.out.println(res);
        assertEquals(37.77777777777778, res, 0.01);

	}


}
