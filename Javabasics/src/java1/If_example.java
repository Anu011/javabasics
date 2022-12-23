package java1;

import java.util.Scanner;

public class If_example {

	public static void main(String[] args) {
		
		int age;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the age:  ");
		
		 age=obj.nextInt();
		 
		
		 if(age>18)
		 {
			 System.out.println("Age is greater than 18");
		 }
		 else
		 {
			 System.out.println("Age is less  than 18");
		 }
	
        
	}

}
