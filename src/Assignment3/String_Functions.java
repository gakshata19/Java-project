package Assignment3;

public class String_Functions {

	public static void main(String[] args) {
		String a="Automation";
		String b="Selenium";
		
		System.out.println(a+b);
		System.out.println(a.concat(b));
		System.out.println(a);
		System.out.println("Lenght of string a is: " +a.length());
		System.out.println("Charater as 3rd index in string a is: "+a.charAt(3));
		System.out.println(b);
		System.out.println("Lenght of string b is: " +b.length());
		System.out.println("Charater as 5th index in string b is: "+b.charAt(5));
		System.out.println("Comparing string a & b using relational operator, result is: "+(a==b));
		System.out.println("Comparing string a & b using equals() method, result is: "+a.equals(b));
		System.out.println("Comparing string a & b using compareTo() method, result is: "+a.compareTo(b));
	}

}
