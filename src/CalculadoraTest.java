import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	double operador1, operador2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
	}

	@BeforeEach
	void setUp() throws Exception {
		
		operador1=3;
		operador2=5;
	}

	@AfterEach
	void tearDown() throws Exception {
		
		operador1=0;
		operador2=0;
	}

	@Test
	void testSuma() {
		double total = 8;
		double sum = Calculadora.suma(operador1, operador2);
		assertEquals(sum, total);
	}

	@Test
	void testResta() {
		double total = -2;
		double res = Calculadora.resta(operador1, operador2);
		assertEquals(res, total);
	}

	@Test
	void testProducto() {
		double total = 15;
		double prod = Calculadora.producto(operador1, operador2);
		assertEquals(prod, total);
	}

	@Test
	void testDivision() {
		double total = 0.6;
		double div = Calculadora.division(operador1, operador2);
		assertEquals(div, total);
	}

}
