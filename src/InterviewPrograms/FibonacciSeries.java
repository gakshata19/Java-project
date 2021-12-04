package InterviewPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0, b=1, temp=0;
		System.out.println(temp);
		for(int i=1; i<=10; i++){
			temp=a+b;
			a=b;
			b=temp;
			System.out.println(temp);
		}

	}

}
