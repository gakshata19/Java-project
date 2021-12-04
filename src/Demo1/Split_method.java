package Demo1;

public class Split_method {

	public static void main(String[] args) {
				
				String a="Amit Patil";
				
				String [] abc=a.split("t");
				System.out.println(abc[0]);
				System.out.println(abc[1]);
				String d=abc[1];
				
				for(int i=d.length()-1;i>=0;i--)
				{
					System.out.print(d.charAt(i));
				}
				
			}

	
	}

