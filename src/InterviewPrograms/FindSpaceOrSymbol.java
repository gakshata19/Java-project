package InterviewPrograms;

public class FindSpaceOrSymbol {

	public static void main(String[] args) {
		String s="hi good# evening @";
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			if(Character.isSpaceChar(ch)) {
				System.out.println("Character at " +(i+1)+ " position is space ");
			}
			else if(!Character.isLetterOrDigit(ch)) {
				System.out.println("Character at " +(i+1)+ " position is special symbol "+ch);
			}
		}

	}

}
