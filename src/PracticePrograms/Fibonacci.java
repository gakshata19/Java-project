package PracticePrograms;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0, b=1, sum;
		for(int i=1; i<=10;i++) {
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);
		}
	}

}
