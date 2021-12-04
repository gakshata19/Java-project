package Assignment6;

public class Program1 {

	public void m1()
	{
		for (int i=1; i<=10; i++)
		{
			if(i!=4)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Numbers 1 to 10 except 4");
		Program1 p= new Program1();
		p.m1();
	}

}
