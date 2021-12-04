package InterviewPrograms;

public class ReverseWord {

	public static void main(String[] args) {
		String str="java  selenium   class";
		String a[]=str.split("\\s+");
		for(String s:a){
			for(int i=s.length()-1; i>=0 ; i--){
				System.out.print(s.charAt(i));
			}
			System.out.print(" ");
		}

	}

}
