package Demo1;

public class charAt_Method {

	public static void main(String[] args) {
		String a="Good Morning Pune";
		
		int b=a.length();
		System.out.println(b);
		System.out.println(a.charAt(0));
		
		//i is initialized to 0 bcoz string is saved at index value 0
		//b-1 is used as endvalue since b will save the total length value of string a
		for (int i=0; i<=b-1; i++)
		{
			if((i!=0) && (i!=5) && (i!=13))
			{
			System.out.print(a.charAt(i));
			}
		}
		
		System.out.println();
		for (int i=2; i<=b-3; i++)
		{

			System.out.print(a.charAt(i));
		}
		
		System.out.println();
		for(int j=b-1; j>=0; j--)
		{
			System.out.print(a.charAt(j));
		}
	}

}
