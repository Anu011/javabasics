package constructors;

public class student {
 static int rollno;
String name;
String branch;

public static void main(String[] args) {
	student obj=new student(100,"Anusha");
	student obj1=new student(101,"laxmi");
	student obj2=new student(102,"raju");
	student obj3=new student(103,"ashu");
	
}
	
	student(int x,String y)
	{
		rollno=x;
		name=y;
		System.out.println("Student Roll no is   :"+rollno+" and Name is "+name+" ");
		
	}
	
		
	}

