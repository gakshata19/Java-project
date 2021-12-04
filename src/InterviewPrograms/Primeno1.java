package InterviewPrograms;

public class Primeno1 {

	public static void main(String[] args) {
		int a=97, count=0;
		for(int i=1; i<=a; i++) {
			if(a%i==0)
				count++;
		}
		if(count==2)
			System.out.println(a +" is a prime no");
		else
			System.out.println(a +" is not a prime no");
	}

}
