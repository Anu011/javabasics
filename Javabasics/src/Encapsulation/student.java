package Encapsulation;

public class student {
	private int rollno; //instance varaible
	private String name;
	private int age;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
		//class is an best example of encapsulation 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	/*public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		System.out.println("some one changing your rollno");
		this.rollno = rollno; 
		//This is a keyword in java that is used to represent current 
		//class instance varaibles
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("someone changing your name");
		this.name = name;
	}*/
	 
	 
}
