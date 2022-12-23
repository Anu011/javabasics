package java1;

public class Bank1 {

	static int availablebalance=3000;

	public static  void Greetcustomer(){
		//method body 
		System.out.println("Welcome to banking application");

	}
	public  void desposit(int amount){

		availablebalance=availablebalance+amount;
		System.out.println("Amount deposited sucesfully");

	}
	public void withdraw(int amount){
		availablebalance=availablebalance-amount;
		System.out.println("Amount withdrawn  sucesfully");


	}
	public int checkbalance(){
		return availablebalance;
	}



	public static void main(String[] args) {
		Bank1 obj=new Bank1();
		Greetcustomer();//directly with method name

		System.out.println("current balance is :  "+obj.checkbalance());//non static methods we need to call as objectname.methodname

		obj.desposit(500);
		System.out.println("current balance is    :" +obj.checkbalance());
		obj.withdraw(200);
		System.out.println("current balance is    :" +obj.checkbalance());








	}

}
