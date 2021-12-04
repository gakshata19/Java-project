package PracticePrograms;

import java.util.Scanner;

public class Space {
	

		public static void main(String [] args){
		String str="This is blank space program";
		String strwithoutspace=str.replaceAll("\\s+","");
		System.out.println(strwithoutspace);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter new line: ");
		String str1= scan.nextLine();
		String str1withoutspace=str1.replaceAll("\\s+","");
		System.out.println(str1withoutspace);
		
	}
}
