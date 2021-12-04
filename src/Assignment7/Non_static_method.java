package Assignment7;

public class Non_static_method {

	public void m1(){
		System.out.println("1st Non static method without return type and zero arguments");}

	public void m2(int a, int b){
		System.out.println('\n'+"2nd Non static method without return type and 2 integer arguments");
		if (a>b){
			System.out.println(a +" is greater than "+b); }
		else{
			System.out.println(b +" is greater than "+a); }	}
	
	public void m3(String a, String b){
		System.out.println('\n'+"3rd Non static method without return type and 2 string arguments");
		System.out.println("Check if String a contains string b" +'\n' +a.contains(b)); }
	
	public void m4(int a, String b){
		System.out.println('\n'+"4th Non static method without return type and 1 integer and 1 string arguments");
		System.out.println("Concatination of a & b is" +(a+b));			}
	
	public  int m5() {
		int a=10, b=12, c=a+b;
		System.out.println('\n'+"Addition is "+c);
		return c;	}
	
	public  String m6(){
		String a= "Testing", b="Automation", c;
		System.out.println('\n'+"Non static method with string return type " +(c=a+b));
		return c;	}
	
	public  float m7(){
		float a=254.36f, b=89.48f, c;
		System.out.println('\n'+"Non static method with float return type "+(c=a-b));
		return c;	}
	
	public  boolean m8(int a, int b){
		System.out.println('\n'+"Method with boolean return type");
		return(a==b);	}
	public static void main(String[] args) {
		System.out.println("Non static methods:");
		Non_static_method ns= new Non_static_method();
		ns.m1();
		ns.m2(7,3);
		ns.m3("Selenium Testing", "Testing");
		ns.m4(12, "Pune");
		System.out.println('\n'+"Non Static methods with return type and arguments");
		ns.m5();
		ns.m6();
		ns.m7();
		ns.m8(15, 15);		
	}

}
