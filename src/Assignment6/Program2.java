package Assignment6;

public class Program2 {

	public void m(String a)
	{
		String b=a;
		for (int i=b.length()-1; i>=0;i--)
		{
			System.out.print(b.charAt(i));
		}
	}
	public static void main(String[] args) {
		
		String b="Automation";
		Program2 p=new Program2();
		p.m(b);

	}

}
