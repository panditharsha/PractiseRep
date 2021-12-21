package collection;


public class Test extends Sample1 {

	public static void main(String[] args) {
		
		Sample1 s1= new Sample1();
		//s1.display3();// calling default method in another package--> not allowed
		//s1.display2();
		Test t= new Test();
		t.display();//calling public method with new object in another package--> allowed
		t.display2();// calling protected method with new object in another package--> allowed
		s1.display();// calling public method in another package--> allowed
		
	}

}


