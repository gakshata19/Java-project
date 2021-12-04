package Demo;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		
		String c="occurrence";
		int j;
		char d[]=c.toCharArray();
		//char b[]= new char[10];
		//b[0]=c.charAt(0);
		for (int i=0;i<d.length; i++)
		{
			 j=1;
			for (int n=i+1; n<d.length; n++)
			{
				if (d[i]==d[n] && d[i]!=' ')
				{
					j++;
					d[j]='0';
					
				}
				if(j>1 && d[i]!='0')
					System.out.println(d[i]);
			
			}
		}
			
			
	

	}

}
