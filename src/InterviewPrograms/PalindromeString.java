package InterviewPrograms;

public class PalindromeString {

	public static void main(String[] args) {
		String s="adcda";
		String s1="";
		for(int i=s.length()-1; i>=0; i--){
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
		if(s.equals(s1))
			System.out.println("String is palindrome number");
		else
			System.out.println("String is not palindrome number");

	}

}
