package PracticePrograms;

public class Fibonacci1 {

	public static void main(String[] args) {
		int a=0, b=1, sum;
		for (int i=1; i<=10;i++) {
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
		}

	}

}
