package Assignment2;

public class For_loop {

	public static void main(String[] args) {
	
		System.out.println("Printing value of  'a' from 10 to 20 except 14 and 17");
		for(int a=10; a<=20; a++)
		{
			if ((a!=14) && (a!=17))
			{
				System.out.println("Value of a: "+a);
			}
		}
	}
}
