
public class Money {
	int value;
	String currency;
	public Money(int value, String currency){
		this.value = value;
		this.currency = currency;
	}
	public int getValue(){
	return value;
	}
	public Money multiply(){
		return new Money(value, currency);
	}

}
