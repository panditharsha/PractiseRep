package Access_Specifiers;

	public class Sample1 {
		
		public void display()
		{
			System.out.println("I am public display method");
		}
		
		private void display1()
		{
			System.out.println("I am private display method");
		}
		
		protected void display2()
		{
			System.out.println("hi am protected display method");
		}
		
		void display3()
		{
			System.out.println("i am default display method");
		}

		public static void main(String[] args)
		{
			Sample1 s= new Sample1();
			s.display1();// calling private method in same class--> allowed
			s.display3();// calling default method in same class--> allowed
			s.display2();// calling protected method in same class--> allowed
			s.display();// calling public method in same class--> allowed

		}
		

	}
