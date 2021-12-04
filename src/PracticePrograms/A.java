package PracticePrograms;

public class A
{
	static int i = 1111;

	static
	{
		i = i-- - --i;   //1111-->1110-->1109=2 
		System.out.println("static block in A: "+i);
	}

	{
		i = i++ + ++i; // 1+1=2
		System.out.println("Non static block in A: "+i);
	}
}
