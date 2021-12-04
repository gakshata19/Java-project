package Assignment6;

public class Program4 {

	public void str(String a, String b)
	{
		System.out.println("1st string is: "+a);
		System.out.println("2nd string is: "+b);
		System.out.println("Concatination of 2 strings is: "+(a.concat(b)));
		System.out.println("Comparison of strings is: "+(a.compareTo(b)));
		System.out.println("Comparison using equals method is: "+(a.equals(b)));
		System.out.println("Length of 1st string is: "+a.length());
		System.out.println("Length of 2nd string is: "+b.length());
		System.out.println("Using contentEquals method: "+a.contentEquals(b));
	}
	public static void main(String[] args) {
		Program4 a=new Program4();
		a.str("Manual Testing", "Automation Testing");
	}

}
