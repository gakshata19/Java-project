package Demo1;

public class Looping {

	public static void main(String[] args) {
	//Print 10 to 1 except 5
 
		int a=10;
		do
		{
			if (a!=5)
			{
			System.out.println(a);
			}
			a--;
		}
		while (a>=1);
	}

}
