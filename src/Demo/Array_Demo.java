package Demo;

import java.util.Arrays;

public class Array_Demo {

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		System.out.println(Arrays.asList(a));
		System.out.println(a[2]);
		for(int i:a)
		{
			System.out.println(i);
		}
		
		String b[]= {"Pune", "Mumbai", "Nashik", "Solapur", "Satara"};
		for (String c:b)
		{
			System.out.println(c);
		}
		
	}

}
