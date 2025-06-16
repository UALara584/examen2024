package hmisjunio2025Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import hmisjunio2025.ConversionTemperatura2;

public class ConversionTemperaturaTest {
	ConversionTemperatura2 c = new ConversionTemperatura2();

	@ParameterizedTest
	@CsvFileSource(resources = "/temperatura.csv")
	
	void temperaturaTest(double input, String from, String to, Double output) {
		assertEquals(output, c.convertTemperature(input, from, to),0.000001);
	}
	
	void temperaturaTestInvalid(double input, String from, String to) {
		assertTrue(Double.isNaN(c.convertTemperature(input, from, to)));
	}
	
}
