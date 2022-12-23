package oops_Accessmodifiers;

public class car {
	/*we wrote this main method to show the constructor 
	  variables and method can be accessed outside the
	  class within in the same package  */
       public static void main(String[] args) {
		student s =new student();
	    System.out.println(s.rollno);
	    s.printrollno();
	}
}
