package access;

import access2.EmployDetails;

public class Employ {
	static String company_name="Tata Vehicle Services";
	int experience, ph;
	String designation;
	EmployDetails Emp;
	
public Employ(int a, int b, String f, EmployDetails w) {
	experience=a;
	ph=b;
	designation=f;
	Emp=w;
}
public void details() {
	System.out.println("Company name is: "+company_name);
	System.out.println("name: "+Emp.name+"  "+"gender: "+Emp.gender+"  "+"age: "+Emp.age);
	System.out.println("Phone number: "+ph);
	System.out.println("experience: "+experience);
	System.out.println("position: "+designation);
}
	public static void main(String[] args) {
    EmployDetails ob= new EmployDetails("shameema","Female",24);	
    Employ ob1= new Employ(2,976897644,"Tester",ob);
    ob1.details();
    System.out.println("************************");
    EmployDetails ob2= new EmployDetails("Thasnim","Female",24);	
    Employ ob3= new Employ(3,11111111,"Tester",ob2);
    ob3.details();
    System.out.println("************************");
    EmployDetails ob4= new EmployDetails("Ammu","Female",24);	
    Employ ob5= new Employ(5,976897644,"Tester",ob4);
    ob5.details();
    System.out.println("**************************");
    EmployDetails ob6= new EmployDetails("shameema","Female",24);	
    Employ ob7= new Employ(2,976897644,"Tester",ob6);
    ob7.details();
    System.out.println("***************************");
    EmployDetails ob8= new EmployDetails("Thakudu","Female",24);	
    Employ ob9= new Employ(2,976897644,"Tester",ob8);
    ob9.details();
	}

}
