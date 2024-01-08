package excel;
import java.io.IOException;

public class Workmain {

	public static void main(String[] args) throws IOException {
		String d="name";
		for(int i=1;i<=8;i++) 
		{
		
		d=WorkCode.readStringData(i, 0);
		System.out.println(d);
			}
			
		
		

	}

}
