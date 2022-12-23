package java1;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
	    
		
		Scanner sc=new Scanner(System.in);
		
		int age;
		
		System.out.println("enter the age:  ");
		
		age=sc.nextInt();
		
		if(age>18)
		{
			System.out.println("Allowed");
		}
		
		
		else
		{
			System.out.println("Not allowed");
		}
		
		
		

	}

}
