package Demo1;

public class Strlength {

	public void m1(String str) {
		int b=0;
		for(char c:str.toCharArray()) {
			b++;
		}
		System.out.println(b);
	}
	public static void main(String[] args) {
		Strlength s=new Strlength();
		s.m1("Selenium");		
	}
}
