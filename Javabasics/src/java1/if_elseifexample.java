package java1;

import java.util.Scanner;

public class if_elseifexample {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int Marks;
	  System.out.println("please Enter student marks");
	  Marks=sc.nextInt();
	  if(Marks>=35 && Marks<=60)
	  {
		  System.out.println("result is passed");
	  }
	  
	  else if(Marks>=61 && Marks<=80)
	  {
		  System.out.println("Student pased with A grade ");
	  }
	  else if(Marks>=81 && Marks<=100)
	  {
		  System.out.println("Student pased with A+ grade ");
	  }
	  
	  else 
	  {
		  
		  System.out.println("failed ");
	  }
	  }
	  
	 
		

	}


