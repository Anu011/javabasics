package Encapsulation;

public class teacher {
	public static void main(String[] args) {
		student st1=new student();
		st1.setRollno(100);
		st1.setName("deepthi");
		st1.setAge(18);
		System.out.println(st1.getRollno());
		System.out.println(st1.getName());
		System.out.println(st1.getAge());
		
		
		
	}
}


//Grouping/wrapping/binding varaibles and methods in a single container 
//in order to provide security to the datamembers 
//getter and setter----this methods we need to specify as public this methods are used to get the 
//values and set the values 


