package access2;

import access.Sample1;

public class Sample3 extends Sample1 {

	public static void main(String[] args) {
		Sample3 ob= new Sample3();
		ob.protected_Method();
		ob.public_Method();
		//ob.default_Method();
		//ob.private_Method();

	}

}
