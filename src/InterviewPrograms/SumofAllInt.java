package InterviewPrograms;

public class SumofAllInt {

	public static void main(String[] args) {
		int a=9458, r, sum=0;
		while (a>0){
			r=a%10;
			sum=sum+r;
			a=a/10;
		}
		System.out.println("Sum of digits is: "+sum);

	}

}
