package Demo;

public class Method {

	//non static non return type 0 args
	//static non return with 2 string args
	//non static non return with 2 int args
	
	public void m1()
	{
		System.out.println("1st method");
	}
	
	public static void m2(String a, String b)
	{
		System.out.println("m2 method");
		System.out.println(a.equals(b));
		//String c=a.split(" ");
	}
	
	public void m3(int a, int b)
	{
		int c=a*b;
		System.out.println(c);
		System.out.println(a%b);
	}
	public static void main(String[] args) {
		System.out.println("MMS");
		Method d= new Method();
		d.m1();
		
		m2("Concat", "Test");
		Method.m2("Automation", "Auto");
		m2("Selenium","Pune");
		
		d.m3(20, 3);
		System.out.println("MME");

	}

}
