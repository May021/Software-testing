package istudy.softwaretesting.junit5;

public class BadCurrencyException extends RuntimeException {
	public BadCurrencyException(String currency) {     //���췽��
		super(String.format("�Ƿ��Ļ������ͣ�%s", currency));
	}
}
