package java1;

import java.util.Scanner;

public class switchexample {
	public static void main(String[] args) {
		
		Scanner  Ashwini=new Scanner(System.in);
		int months;
		System.out.println("Enter Month Number:    ");
		months=Ashwini.nextInt();
		
		switch(months)
		{
		case 1: System.out.println("jan");
		 break;
		case 2: System.out.println("feb");
		 break;
		case 3: System.out.println("march");
		 break;
		case 4: System.out.println("april");
		 break;
		case 5: System.out.println("may");
		 break;
		case 6: System.out.println("june");
		 break;
		case 7: System.out.println("july");
		 break;
		case 8: System.out.println("Aug");
		 break;
		case 9: System.out.println("sept");
		 break;
		case 10: System.out.println("oct");
		 break;
		case 11: System.out.println("nov");
		 break;
		case 12: System.out.println("Dec");
		 break;
		 default: System.out.println("invalid month");
		}
		
		
		
	}

}
