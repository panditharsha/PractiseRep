package practise;

public class countchar {

	public static void main(String[] args) {
		String india = "India is my country and all are my brother and sister";
		
		String ref=" ";
		 int count = 0;
		String output[]=india.split(ref);
		
	// System.out.println(output.length);
		
		for(int i=0;i<=output.length-1;i++)
		{
			count ++;
		}
				System.out.println(count);

	}

}
