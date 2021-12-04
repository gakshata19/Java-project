package Demo1;

public class Reverse_method {

	
	public void m1(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
		System.out.println("Hello Pune");
	}
	
	public void m2(String b[])
	{
		String e[]=b;
		for (int i=0; i<e.length; i++)
		{
			for (int j=e[i].length()-1; j>=0; j--)
			{
				System.out.print(e[i].charAt(j));
			}
			System.out.println();
		}
			
	}
	
	public void m3(String a[])
	{
		String b[]=a;
		for (int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		
		Reverse_method a= new Reverse_method();
		
		String b[]= {"Pune", "Mumbai", "Nashik", "Solapur", "Kolhapur"};
		String c[]= {"Vinod", "Yogesh", "Sagar", "Akshata", "Nikita","Rupesh"};
		a.m1(2,8);		
		a.m1(7,6);
		
		System.out.println('\n'+"Values of 1st array");
		a.m3(b);
		System.out.println('\n'+ "Reverse value of 1st array");
		a.m2(b);
		System.out.println('\n'+"Values of 2nd array");
		a.m3(c);
		System.out.println('\n'+ "Reverse value of 2nd array");
		a.m2(c);
	}
}
