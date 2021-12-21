package Access_Specifiers;

public class Sample2 {

	public static void main(String[] args) {
		
		Sample1 s1= new Sample1();
		//s1.display1();--> display1 is private not accessible in another class
		
		s1.display3();// calling default method within same package--> allowed
		s1.display2();// calling protected method within same package--> allowed
		s1.display();//calling public method within same package class--> allowed
	}


}
