package collectioneg;

import java.util.ArrayList;

public class ColorWork {

	public static void main(String[] args) {
		
		ArrayList<String> colors=  new <String>ArrayList(); 
		colors.add("white");
		colors.add("blue");
		colors.add("red");
		colors.add("orange");
		colors.add("black");
		colors.add("brown");
		System.out.println(colors);
		
		
		System.out.println(colors.get(3));
		
		for(String a:colors) {
			System.out.println(a);
			
		}
       
		
		colors.remove(2);
		System.out.println(colors);
		
        String s="black";
        for(String a:colors) {
			if(a==s) {
				System.out.println("the element is found and the element is :"+a);
				break;
			}
			
			
		}
       
        
	}

}
