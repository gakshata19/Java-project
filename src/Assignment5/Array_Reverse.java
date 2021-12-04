
package Assignment5;
import java.util.Arrays;
public class Array_Reverse {

	public static void main(String[] args) {
		String a []= {"Java", "Selenium", "Cucumber", "GitHub", "API"};
		System.out.println("Number of elements in array a are: "+a.length);
		
		System.out.println(Arrays.toString(a));
		System.out.println('\n'+"Values of array a are: ");
		for (String i:a)
		{
			System.out.println(i);
		}
		
		System.out.println('\n'+"Reverse of every element of array a is:");
		for (int i=0; i<a.length; i++)
		{
			for (int j=a[i].length()-1; j>=0; j--)
			{
				System.out.print(a[i].charAt(j));
			}
			System.out.println();
		}
		
		for(int i=a.length-1; i>=0; i--) {
			System.out.println(a[i]);
		}
	}

}
