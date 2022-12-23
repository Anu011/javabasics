package java1;

public class Nested_if {

	public static void main(String[] args) {
	
		
		int age=19;
		int weight=58;
		
		if(age>18)
		{
			if (weight<50)
			{
				System.out.println("you are eligible to perform stunt");
			}
			else 
			{
				System.out.println("not eligible");
			}
		}
		else {
			System.out.println("not eligible");
		}

	}

}
