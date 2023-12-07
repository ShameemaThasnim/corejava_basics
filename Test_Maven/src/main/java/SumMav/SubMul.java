package SumMav;

public class SubMul {
	int a,b;
	public static void main(String args[]) {
		
		SubMul s= new SubMul(20,10);
		s.sub();
		
	}
	public SubMul(int d, int g)
	{
		a=d;
		b=g;
	}
	public void sub() {
		this.mul();
		int subi=a-b;
		System.out.println("the subs out is:"+subi);
	
		
	}
	public void mul() {
		int mul=a*b;
		System.out.println("the multi out is:"+mul);
		
	}

}
