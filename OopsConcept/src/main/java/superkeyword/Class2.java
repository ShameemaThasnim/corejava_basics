package superkeyword;

public class Class2 extends Class1{
	static int c;
    public  void div() {
    	
    	if(c%10==0) {
    		System.out.println("the number is divisible by 10");
    		
    	}
    	else {
    		System.out.println(" the number is not divisible by 10");
    	}
    }
	public static void main(String[] args) {
		
		Class2 n= new Class2();
		c=n.add();
		n.div();

	}

}
