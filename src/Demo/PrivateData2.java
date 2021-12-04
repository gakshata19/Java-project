package Demo;

public class PrivateData2 extends PrivateData {

	public static void main(String[] args) {
		PrivateData2 p= new PrivateData2();
		System.out.println(p.getA());
		p.setA(100);
		System.out.println(p.getA());
	}

}
