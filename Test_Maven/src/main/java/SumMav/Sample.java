package SumMav;

public class Sample {
	int a,b,sum;
	public static void main(String args[]) {
		Sample s=new Sample(10,20);
		s.sum();
		
	}
	public Sample(int d, int g) {
		a=d;
		b=g;
		
	}
	public void sum() {
		
		sum=a+b;
		System.out.println(sum);
	}
	}


