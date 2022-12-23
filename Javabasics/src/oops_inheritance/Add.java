package oops_inheritance;


   class Add{
	   int a=10;
	   int b=10;
	   void add() {
		   System.out.println(a+b);
	   }
	   
   }
   
   class Sub extends Add{
	   
	   void sub() {
		   System.out.println(a-b);
	   }
	   
   }
   
   
class Mul extends Sub{
	   
	   void mul() {
		   System.out.println(a*b);
	   }
	   
   }



class Div extends Mul{
	   
	   void div() {
		   System.out.println(a/b);
	   }
	   
}
	class Multilevel
	{
	public static void main(String[] args) {
		
		Div obj= new Div();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
	}

	}

