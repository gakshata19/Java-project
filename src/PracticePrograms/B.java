package PracticePrograms;

public class B extends A{
	static
	{
		i = --i - i--; //1-1=0
		System.out.println("static block in B: "+i);
	}

	{
		i = ++i + i++; //3+3
		System.out.println("non static block in B: "+i);
	}
}
