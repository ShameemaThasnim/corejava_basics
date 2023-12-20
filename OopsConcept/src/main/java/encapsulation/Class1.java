package encapsulation;

public class Class1 {
private int pin=1001, pin1=1234, pin2=1212;
public void getter(int n) {
	
	if(n==pin||n==pin1||n==pin2)
	{
		System.out.println("withdraw the cash");
	}
	else {
		System.out.println("User is invalid");
	}
	
	
	
}
}
