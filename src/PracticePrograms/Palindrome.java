package PracticePrograms;

public class Palindrome {

	public static void main(String[] args) {
		int c=323, sum=0, r=0;
		while (c>0){
			r=c%10;
			sum=sum*10+r;
			c=c/10;	
		}
		System.out.println("Palindrome number is: "+sum);
	}
}
