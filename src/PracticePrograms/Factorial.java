package PracticePrograms;

public class Factorial {

	public static void main(String[] args) {
			int a=5, factorial=1;
//			for(int i=a; i>0; i--){
//				factorial=factorial*i;
//			}
			
			for(int i=1; i<=a; i++) {
				factorial=factorial*i;
			}
			System.out.println("Factorial of "+a+ " is "+factorial);
		}
}


