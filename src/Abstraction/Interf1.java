package Abstraction;

public  class Interf1 implements Interface1,  Interface2{
	public void m4() {
		System.out.println("m4 method");	}
	public static void main(String[] args) {
		Interface2 i=new Interf1();
		i.m1();
		i.m2();
		i.m3();
		i.a1();
		i.a2();
		i.a3();
	}
	@Override
	public void m1() {
		System.out.println("m1 method");	
	}
	@Override
	public void m2() {		
		System.out.println("m2 method");
	}
	@Override
	public void m3() {
		System.out.println("m3 method");		
	}
	@Override
	public void a1() {
		System.out.println("a1 method");		
	}
	@Override
	public void a2() {
		System.out.println("a1 method");	
	}
	@Override
	public void a3() {
		System.out.println("a1 method");	
	}
	

}
