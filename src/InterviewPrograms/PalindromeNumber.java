package InterviewPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		int i=19791, r, sum=0, a;
		a=i;
		while (i>0) {
			r=i%10;
			sum=sum*10+r;
			i=i/10;
		}
		if(sum==a)
			System.out.println(a +" is palindrome number");
		else
			System.out.println(a +" is not a palindrome number");

	}

}
