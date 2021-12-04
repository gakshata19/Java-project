package Assignment;

public class Arithmetic_op1 {

	public static void main(String[] args) {

		 int a=19;
		 int b=8;
		 int c=a+b;
		 System.out.println("Value of a:"+a +"  " 
				
				+ "Value of b:"+b +"  " 
				+ "Value of c:"+c);
		 
		 a+=3;//a=a/3
		 System.out.println(a);
		 System.out.println("Addition of a and b is "+c); //27
		 int d=c-b;
		 System.out.println("Subtraction of c and b is "+d); //19
		 int e=a*b;
		System.out.println("Multiplication of a and b is "+e); //152
		 int f=e/b;
		System.out.println("Division of e and b is "+f); //19
		 int g=a%b;
		System.out.println("Modulus of a and b is "+g);
		 b++;
		System.out.println("Value of b after increment "+b);
		 b+=3;
		System.out.println("Value of b after adding 3 is "+b);
		 a--;
		System.out.println("Value of a after decrement is "+a);
		 a-=5;
		System.out.println("Value of a after subtrating 5 is "+a);

	}

}
