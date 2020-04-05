import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTests {  //������  CalculatorTests��������
	static class Calculator{    //��̬��Ա��  
		int add(int a, int b) {
			return a + b;
		}
	}
	private final Calculator calculator = new Calculator();  //Arrange
	
	@Test 
	void addition() { // ���Է���
		int actual = calculator.add(1, 1);
		assertEquals(2, actual); // ����
	}
}

