package oops_inheritance;

//Example to demonstrate single level inheritance 
 class Employee //Baseclass or superclass or parent class
{
	float sal=40000; //instance variable
	
}

 class programmer extends Employee {  //child class/derivedclass/sub class
	 int bonus=10000;
	 public static void main(String[] args) {
		 programmer p=new programmer();
		 float Totalsal=p.bonus+p.sal;
		 System.out.println("Total salary is:   "+Totalsal);
		
	}
}
    