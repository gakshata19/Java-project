package Assignment8;

import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) {
		
		String a[]= {"TestNG", "Junit", "Selenium","TOSCA", "Protector"};
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<a.length;i++)
		{
			for (int j=a[i].length()-1; j>=0; j--)
			{
				System.out.print(a[i].charAt(j));
			}
			System.out.println();
		}
	}

}
