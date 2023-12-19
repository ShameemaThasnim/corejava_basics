package SumMav;

public class Details {
	int age;
	String name;
	public static void main(String args[]) {
		Details s= new Details("shameema",24);
		s.disply();
		
	}
	public Details(String s, int b) {
		name=s;
		age=b;
		
	}
	public void disply() {
		System.out.println(name);
		System.out.println(age);
	}

}
