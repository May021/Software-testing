import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTests {  //测试类  CalculatorTests：顶级类
	static class Calculator{    //静态成员类  
		int add(int a, int b) {
			return a + b;
		}
	}
	private final Calculator calculator = new Calculator();  //Arrange
	
	@Test 
	void addition() { // 测试方法
		int actual = calculator.add(1, 1);
		assertEquals(2, actual); // 断言
	}
}

