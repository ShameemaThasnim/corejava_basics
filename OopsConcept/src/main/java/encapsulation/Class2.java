package encapsulation;
import java.util.Scanner;

public class Class2 {
    int a;
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the PIN number:");
		int a=s.nextInt();
		Class1 ob= new Class1();
		ob.getter(a);
		

	}

}
