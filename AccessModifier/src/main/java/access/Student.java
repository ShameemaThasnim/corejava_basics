package access;

import access2.Address;

public class Student {
	
	static String collage="Universal Engineering collage";
	int roll;
	String name;
	Address ad;
	
	public Student(String s,int r, Address g) {
	name=s;
	roll=r;
	ad=g;
		
	}
	public void disply() {
		System.out.println("the name is : "+name);
		System.out.println("the roll number is :"+roll);
		System.out.println("the collage name is :"+collage);
		System.out.println("street:"+ad.street+" "+"district:"+ad.district+" "+"Pin: "+ad.pin+"house no: "+ad.house_no);
	}

	public static void main(String[] args) {
	Address ob2=new Address("amala street","ernakulam",6578,129);	
    Student ob= new Student("Shameema",24,ob2);
    ob.disply();
    System.out.println("**************");
    Address ob3=new Address("amala street","ernakulam",6578,129);	
    Student ob1= new Student("Shameema",24,ob3);
    ob1.disply();
    System.out.println("**************");
	}

}