package Inheritance;

public class Sample extends Demo{

	public void s1() {
		System.out.println("S1 method in Sample Class");
	}
	
	public void s2() {
		System.out.println("S2 method in Sample Class");
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

