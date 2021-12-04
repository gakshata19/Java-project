package InterviewPrograms;

public class SumOfDigits {

	public static void main(String[] args) {
		String s="aabc22dsgf58hjh107";
		char ch; 
		int sum=0;
		for(int i=0; i<s.length(); i++){
		ch=s.charAt(i);
		if(Character.isDigit(ch)){
			int n=Character.getNumericValue(ch);
			sum=sum+n;
		} 
		}
		System.out.println("Sum of digits in string is: "+sum);
	}
}
