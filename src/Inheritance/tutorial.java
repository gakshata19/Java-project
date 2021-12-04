package Inheritance;

public class tutorial extends Sample {

	public void t1() {
		System.out.println("t1 method in tutorial Class");
	}
	
	public void t2() {
		System.out.println("t2 method in tutorial Class");
	}
	
	public static void main(String[] args) {
		
		tutorial obj=new tutorial();
		obj.d1();
		obj.d2();
		obj.s1();
		obj.s2();
		obj.t1();
		obj.t2();		
	}
}


