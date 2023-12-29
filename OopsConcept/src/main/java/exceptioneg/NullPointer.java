package exceptioneg;

public class NullPointer {
    static String s;
	public static void main(String[] args) {
		try {
		
		System.out.println(s.length());
		}
		catch(NullPointerException e)//(class name object name)
		{
			e.printStackTrace();//for printing the exception trace
			//System.out.println(e); to know the exception class
		}
		
		System.out.println("NullPointer is resolved");
		

	}

}
