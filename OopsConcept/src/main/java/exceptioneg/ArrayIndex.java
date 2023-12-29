package exceptioneg;

public class ArrayIndex {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,8};
		try {
		
		for(int i=0;i<=a.length;i++)
		{
			System.out.print(a[i]);
			
		}
		}
		catch(ArrayIndexOutOfBoundsException  e) {
        e.printStackTrace();
	}
		//finally {
			System.out.println(" Array exception solved");
		//}

}
}