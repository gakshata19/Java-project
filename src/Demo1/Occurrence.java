package Demo1;
import java.util.Arrays;
public class Occurrence {

	public void m1(String s)
	{
		char c;
		int count=1;
		for (int i=0; i<s.length()-1; i++)
		{
		 c=s.charAt(i);
		 if(c!=s.charAt(i+1))
		 {
		 	for (int j=i+1; j<s.length()-1; j++)
		 	{
		 		if (c==s.charAt(j))
		 		{
		 			count++;		 			
		 		}		 		
		 	}		 	
		 }
		 System.out.println(s.charAt(i)+" occurred " +count +" times");
		}
		
	}
	public static void main(String[] args) {
//		Occurrence a=new Occurrence();
//		a.m1("occurrence");
		String c="occurrence";
		char b[]= new char[10];
		b[0]=c.charAt(0);
		for (int i=1;i<c.length(); i++)
		{
			if(c.charAt(i)!=b[i-1])
			{
				b[i]=c.charAt(i);
			}	
		}
		for (char a:b)
		{
			System.out.println(a);
		}
		String d=Arrays.toString(b);	
		System.out.println(d);
		
	}

}
