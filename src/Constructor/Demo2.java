package Constructor;

public class Demo2 extends Demo1{

	Demo2(){
		this("Aksh", 4);
		System.out.println("Demo2 0 args cons");//5
	}
	Demo2(int a){
		super(20);	
		System.out.println("Demo2 1 args cons");
	}
	Demo2(String a, int b){
		System.out.println("Demo2 2 args cons");//4
	}
	public static void main(String[] args) {
		Demo2 d1=new Demo2();

	}

}
