package collections;
import java.util.ArrayList;// import the ArrayList class
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
		List l1=new ArrayList<>();// Create an ArrayList object
		//Adding objects
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		
		System.out.println(l1);
		//Serching  an object
		System.out.println(l1.get(1));
		//Modify the object
		l1.set(0, 100);
		System.out.println(l1);
		
	//Remove an item
		l1.remove(3);
		System.out.println(l1);
		//sorting
		Collections.sort(l1);
		System.out.println(l1);
		
	}

}
