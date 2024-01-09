package excel;

import java.io.IOException;

public class Workmain {
    static String d;
	public static void main(String[] args) throws IOException {
		
		for(int i=1;i<=8;i++) 
		{
		d=WorkCode.readStringData(i, 0);
				
		System.out.println(d);
			}
			
		
		

	}

}
