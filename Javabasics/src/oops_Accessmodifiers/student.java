package oops_Accessmodifiers;

public class student {
    public int rollno=101;//variable declared as public
    public student() {  //constructor declared as public
    	rollno=102;
    	
    }
    public void printrollno() //method declared as public
    {
    	System.out.println(rollno);
    }
    /*This method shows that we can access the variable and 
    methods within the class*/
    private void abc() {
    	printrollno();
    	System.out.println(rollno);
    }
}
