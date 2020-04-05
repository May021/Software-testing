package istudy.softwaretesting.junit5;

public class BadCurrencyException extends RuntimeException {
	public BadCurrencyException(String currency) {     //构造方法
		super(String.format("非法的货币类型：%s", currency));
	}
}
