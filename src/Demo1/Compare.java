package Demo1;

public class Compare {

	public static void main(String[] args) {
		String a="PUNE";
		String b="Pune";
		String c="PuNe";
		String d="pune";
		String f="PUNE";
		
		System.out.println("Using relational operator");
		System.out.println(a==b); //false
		System.out.println(a==d); //false
		System.out.println(a==f); //true
		System.out.println(b==c); //false
		System.out.println(d==a); //false
		System.out.println(f==b); //false
		System.out.println(c==f); //false
		
		System.out.println();
		System.out.println("Using equals() method");

		System.out.println(a.equals(d)); //false
		System.out.println(a.equals(c)); //false
		System.out.println(a.equals(f)); //true
		System.out.println(a.equals(b)); //false
		System.out.println(f.equals(a)); //true
		System.out.println(d.equals(d)); //true
		System.out.println(b.equals(f)); //false
		
		System.out.println("Using compareTo() method");
		System.out.println(b.compareTo(d));  //-ve
		System.out.println(b.compareTo(c)); //+ve
		System.out.println(c.compareTo(b)); //-ve
		System.out.println(c.compareTo(f)); //+ve
		System.out.println(a.compareTo(d)); //-ve
		System.out.println(b.compareTo(d)); //-ve
		
	}

}
