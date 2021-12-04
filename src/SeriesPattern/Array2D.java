package SeriesPattern;

public class Array2D {

	public static void main(String[] args) {
		int a[] [] = {{4,5,6},{1,2,3}};
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
			
	}

}

//4 5 6
//1 2 3
