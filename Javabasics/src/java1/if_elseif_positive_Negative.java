package java1;

import java.util.Scanner;

public class if_elseif_positive_Negative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int i;
		System.out.println("Enter value of i:  ");
		
		
		i=sc.nextInt();
		
		
		
		
		if(i>0)
		{
			System.out.println("positive");
		}
		else if(i<0)
			
		{
			System.out.println("Negative");
		}
		
		else {
			System.out.println("zero");
		}
	}

}
