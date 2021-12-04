package InterviewPrograms;

import java.util.Arrays;

public class All0toEndInArray {

	public static void main(String[] args) {
		int a[]= {4,0,0,7,3,0,1,0,8,11,20};
		int temp;
		for(int i=1; i<a.length; i++) {
			for(int j=i; j>0;j--) {
				if(a[j]!=0 && a[j-1]==0) {
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
//		for(int i:a) {
//				System.out.print(i +" ");
//		}
	}

}
