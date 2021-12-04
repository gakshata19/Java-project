package SeriesPattern;

public class StarSeries {

	public static void main(String[] args) {
		System.out.println("* series *"+'\n');
		
		for(int i=5; i>=1; i--) {
				for(int j=i;j<=5;j++) {
				System.out.print("*"+" ");
				}
			System.out.println();		
		}
	}
}
