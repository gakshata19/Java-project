package Assignment7;

public class Static_method {

	public static void m1()
	{
		System.out.println("1st static method");
	}
	
	public static void m2(int a, int b, String p, String q)
	{
		char m[]=q.toCharArray();
		System.out.println(m.length);
		for(char n:m)
		{
			System.out.println(n);
		}
		System.out.println(m[2]);
		System.out.println(p.compareToIgnoreCase(q));
		System.out.println(p.endsWith(q));
		System.out.println(a+p+b+q);
	}
	
	public static  char m3()
	{
		char m[]= {'a', 'b', 'c', 'd'};
		return m[1];
	}
	
	public static String m4(String a[])
	{
		for(String i:a)
		{
			System.out.println(i);
		}
		return a[1];
	}
	public static void main(String[] args) {
		
		m1();
		Static_method.m2(21, 7, "Concatination","nation");
		System.out.println(m3());
		
		String b[]= {"Pune", "Mumbai", "Nashik", "Aurangabad"};
		m4(b);		
	}
}
