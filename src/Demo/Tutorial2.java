package Demo;

public class Tutorial2 extends Tutorial1 {
	public static void t1() {
		System.out.println("t1 method");
	}
	public void t2() {
		System.out.println("t2 method");
	}
	
	public static void main(String[] args) {
		Tutorial2 a= new Tutorial2();
		a.m1();
		m2();
		a.t2();
		t1();
		Tutorial2.m2();
		
		Tutorial2 x = new Tutorial3();
		x.m1();
		x.t1();
	
	}

}
