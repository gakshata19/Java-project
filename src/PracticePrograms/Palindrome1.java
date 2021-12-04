package PracticePrograms;

public class Palindrome1 {

	public static void main(String[] args) {
		int a=17571, sum=0, r=0, b;
		b=a;
		while(a>0){
		r=a%10;
		sum=sum*10+r;
		a=a/10;
		}
		if(b==sum){
		System.out.println("Number is palindrome: "+sum);
		} else
		System.out.println("Number is not palindrome");

	}

}
