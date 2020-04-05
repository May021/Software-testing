package istudy.softwaretesting.junit5;

import java.util.Objects;

public final class Money {
	private final String currency;  //货币属性
	private final int amount;    //金额属性
	
	public Money(String currency, int amount) {  //构造函数 把货币和金额传进来
		if(amount < 0) {
			throw new NegativeMoneyAmountException();  //负数 Negative  
		}
		this.amount = amount;      //没问题  赋值
		this.currency = currency;
	}
	
	public static Money dollar(int amount) {     //工厂方法  生产dollar
		return new Money("USD", amount);
	}
	
	public static Money renminbi(int amount) {   //工厂方法  生产RMB
		return new Money("RMB", amount); 
	}
	
	public Money add(Money money) {  //操作  
		if(money.currency.equals(this.currency)) {   //货币相同情况下  才能操作
			return new Money(this.currency, amount + money.amount);
		}
		throw new BadCurrencyException(money.currency);
	}
	
	@Override
	public boolean equals(Object o) {    //判断值是不是相等
		if (this == o) 
			return true;
		if (o == null || getClass() != o.getClass()) 
			return false;
		Money money = (Money) o;
			return Double.compare(money.amount, amount ) == 0 && Objects.equals(currency, money.currency);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(currency, amount);
	}
}