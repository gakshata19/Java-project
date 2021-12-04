package SeriesPattern;

public class OddNumberSeries {

	public static void main(String[] args) {
		System.out.println("OddNumberSeries");
		int a=1;
		for(int i=1; i<=5; i++) {
			for(int j=1;j<=a ;j++) {
				System.out.print(j+" ");
				j++;		
			}
			a=a+2;			
			System.out.println();
		}
	}
}
