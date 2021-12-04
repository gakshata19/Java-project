package Assignment8;

import java.util.Arrays;

public class Methods {

	public void m1() {
		m2();
		System.out.println("M1 method");
	}
	public static void m2() {
		System.out.println("M2 method");
	}
	public String m3(String a) {
		m1();
		System.out.println("M3 method");
		String b[]=a.split(" ");
		for (String c:b) {
		System.out.println(c);
		}
		return Arrays.toString(b);
	}
	public static int m4(float a) {
		System.out.println("M4 method");
		 System.out.println(Math.round(a));
		 return 1;
	}
	public static void main(String[] args) {
		Methods a= new Methods();
		System.out.println(m4(245.66f));
		a.m3("Selenium with the help of Java");
	}

}
