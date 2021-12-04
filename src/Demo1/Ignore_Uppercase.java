package Demo1;

public class Ignore_Uppercase {

	public static void main(String[] args) {
		String a="Good Morning Pune";
		
		int b=a.length();
		
		for(int i=0; i<=b-1; i++)
		{
			char c=a.charAt(i);
			if ((c>= 'a')  &&  (c<= 'z'))
			{
				System.out.print(a.charAt(i));
			}
			else
				System.out.print(" ");
		}

	}

}
