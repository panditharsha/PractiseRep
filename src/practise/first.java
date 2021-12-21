package practise;

public class first {

	
	int a=90;
	
	static int b=40;
	public static void main(String[] args) {
		first V =new first();
		V.main1();
	}
	
	public void main1()
	{
	int	a=100;
	
	int sum=a+a;
	System.out.println("sum of local variable and global variable "+sum);
	}
	public static void main2()
	{
		
		System.out.println("b is "+b);
	}

}
