package Assignment3;

public class Reverse_String {

	public static void main(String[] args) {
		String a="Automation using Selenium";
		int b=a.length();
		
		for(int i=b-1; i>=0; i--)
		{
			System.out.print(a.charAt(i));
		}

	}

}
