package Constructor;

public class Demo {
	Demo(int a){
		System.out.println(a);
	}
	
	Demo(int b, int c){
		System.out.println(b+c);
	}
	public void m1() {
		System.out.println("m1");
	}
	public static void main(String[] args) {
		Demo v= new Demo(10);
		Demo u=new Demo(20, 30);
		u.m1();
	}
}
