package InterviewPrograms;

public class PrimeNumbers {

	public static void main(String[] args) {
		int num=0; 
		for(int i=1; i<=25; i++) {
			int count=0;
			for(num =i; num>=1; num--) {
				if(i%num==0) {
					count++;
				}	
			}
			if(count==2)
				System.out.println(i);
		}		
	}
}
