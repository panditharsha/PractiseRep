package access_test;

import Access_specifiers.sample1;

public class Test  extends sample1
{

	public static void main(String[] args)
	{
          sample1 S1= new sample1();
          //S1.display3();// calling default method in another package---> not allowed
      //    S1.displa2y();
          S1.display(); // calling public method in another package----> allowed
          
          Test t= new Test();
          t.display(); // calling public method with new object in another package ----> allowed
          t.display2();///calling protected method with new object in another package ----> allowed
          S1.display();// calling public method in another package ---> allowed
          
          }

}
