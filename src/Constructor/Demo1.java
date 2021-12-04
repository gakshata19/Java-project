package Constructor;

public class Demo1 {
	Demo1(){
		this(10);
		System.out.println("0 arg cons");//3
}
	Demo1(int a){
		this("abc", 200);
		System.out.println("1 arg cons");//2
	}
	Demo1(String s, int a){
		System.out.println("2 arg cons");//1
	}

	public static void main(String[] args) {
	

	}
}