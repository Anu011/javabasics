package oops_inheritance;

import oops_Accessmodifiers.student;

public class subclass_acessmodifier extends student {
  public static void main(String[] args) {
	new subclass_acessmodifier().test();
}
	public  void test() {
		System.out.println(rollno);
		printrollno();

	}

}
