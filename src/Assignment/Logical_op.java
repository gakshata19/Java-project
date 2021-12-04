package Assignment;

public class Logical_op {

	public static void main(String[] args) {
		int a=10, c=10;
		 int b=12, d=12;

		System.out.println(b<a);

		System.out.println(a<b);

		System.out.println("Result for AND operator");
		System.out.println((b<a)&&(a>b));
		System.out.println((a==c)&&(a<b));

		System.out.println("Result for OR operator");
		System.out.println((a<d)||(b==d));
		
		System.out.println(!((a<d)||(b==d)));

		System.out.println("Result for not ! operator");
		System.out.println((a<=c)||(b<c));
		System.out.println(!((a<=c)||(b<c)));

	}

}
