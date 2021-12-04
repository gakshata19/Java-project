package InterviewPrograms;

public class StringLength {
	
	public int strLength(String s){
		int b=0;
		for(char c:s.toCharArray()){
			b++;
		}
		return b;
	}
	public static void main(String []args){
		StringLength sl=new StringLength();
		int length=sl.strLength("This is length method");	
		System.out.println("String length is: "+length);
	}

}
