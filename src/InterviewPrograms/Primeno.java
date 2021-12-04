package InterviewPrograms;

	public class Primeno {
	
		public static void main(String[] args) {
			int num=0, a=18; 
			for(int i=1; i<=25; i++) {
				int count=0;
				for(num =i; num>=1; num--) {
					if(i%num==0) {
						count++;
					}	
				}
				if(i==a) {
					if(count==2)
						System.out.println(i+" is prime no");
					else
						System.out.println(i+" is not a prime no");
				}
			}		
	
		}
	
	}
