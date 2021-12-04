package InterviewPrograms;

public class SortArray {

	public static void main(String[] args) {
		int a[]={26, 12, 4, 31, 17, 9, 42, 1};
		int temp;
		for(int i=1; i<a.length; i++){
			for(int j=i; j>0; j--) {
				if(a[j]<a[j-1]){
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;	
				}
			}
		}
		for(int i:a) {
			System.out.print(i +" ");
		}

//		int[] array = { 45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8 };
//		int temp;
//		for (int i = 1; i < array.length; i++) {
//			for (int j = i; j > 0; j--) {
//				if (array[j] < array[j - 1]) {
//					temp = array[j];
//					array[j] = array[j - 1];
//					array[j - 1] = temp;
//				}
//			}
//		}
//		for (int i = 0; i < array.length; i++) {
//		System.out.print(array[i] + " ");
//		}
	}

}
