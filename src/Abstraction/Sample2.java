package Abstraction;

public class Sample2 extends Sample1{

	public void m5()
	{ System.out.println("M5 method");}
	
	public static void main(String[] args) {
		Sample1 s= new Sample2();
		s.m1();
		s.m2();
		s.m3();
		s.m4();
	}

	@Override
	public void m4() {
		System.out.println("M4 method");
		
	}

}
