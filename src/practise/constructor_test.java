package practise;

public class constructor_test {
	
	int a;
	int b;
	int c;
	
	public constructor_test()
	{
		a=10;
		b=20;
		c=30;
		
	}
	
	
	public constructor_test( int d, int e , int f)
	{
		a=d;
		b=e;
		c=f;
		
	}

	public static void main(String[] args) {
		
	constructor_test name = new constructor_test();
	//	System.out.println("A is "+name.a);
	//	System.out.println("B is "+name.b);
	name.test2();
	constructor_test name1 = new constructor_test( 20,30,40);
	name1.test2();

	}
	public void test2()
	{   
	
		int sum =a+b+c;
		System.out.println("sum of three charactor "+sum);
	}
	
	

}
