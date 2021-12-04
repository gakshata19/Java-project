package Demo;

public class Demo6 {

	public int m3() {
		System.out.println("Non static method with int return type and 0 args");
		return 10;
	}
	public String m4(String a, String b) {
		System.out.println("Non static method with String return type and with 2 string parameter");
		return a;
	}
	
	public static void m2(int a, int b, String c) {
		System.out.println(a+b+c);//30seleniu
		System.out.println(c+a+b);//selenium1020
	}

		public static void main(String[] args) {
			Demo6 obj=new Demo6();
			obj.m3();
			System.out.println(obj.m4("selenium", "testing"));
			m2(10,20,"selenium");
	}

}
