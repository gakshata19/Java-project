package Assignment2;

public class IF_loop {

	public static void main(String[] args) {
	
		int a=1523;
		if((a>=1) && (a<=100))
		{
			System.out.println("a is smaller no.");
		}
		
		else if((a>=101) && (a<=1000))
		{
			System.out.println("a is medium no.");
		}

		else if((a>=1001) && (a<=10000))
		{
			System.out.println("a is larger no.");
		}
		
		else if (a>=10001)
		{
			System.out.println("a is largest no.");
		}
		
		else
		{
			System.out.println("a is negative no. or zero");
		}
	}

}
