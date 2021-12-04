package PracticePrograms;

public class Pyramid1 {

	public static void main(String[] args) {
		int rowcount=1;
		int linecount=9;
		
		for(int i=linecount; i>0; i--) {
			for(int j=0; j<=i;j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=rowcount; j++) {
				System.out.print(rowcount+" ");
			}
			System.out.println();
			rowcount++;
		}

	}

}
