package Demo;

public class Tutorial3 extends Tutorial2{
	public void d1() {
		System.out.println("d1 method");
	}
	
	public void d2() {
		System.out.println("d2 method");
	}
	public static void main(String[] args) {
		Tutorial2 x = new Tutorial3();
		x.m1();
		x.m2();
		x.t1();
		x.t2();

	}

}
