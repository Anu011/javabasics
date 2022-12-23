package java1;

public class Bank {
     static int currentbalance=2000;
	public static void Greetcustomer() {
		//method body
		
		System.out.println("Hello,welcome to the internet banking application");
	}
	
	public   void  deposit(int amount) {
		currentbalance=currentbalance+amount;//500 
		System.out.println("Amount deposited sucessfully");
	}
	//performing minus operation to withdraw amount 
public void withdraw(int amount) {
	
currentbalance=currentbalance-amount;
	System.out.println("Amount withdraw sucessfully");
		
	}
public int checkbalance() {
	return currentbalance;
}

	public static void main(String[] args) {
		Bank b1=new Bank();//instatiating or allowcating some memory to variables  and methods within the class 
		Greetcustomer();
		System.out.println("current balance is :  "+b1.checkbalance());
		
		b1.deposit(200);
		System.out.println("current balance is    :" +b1.checkbalance());
		b1.withdraw(100);
		System.out.println("current balance is    :" +b1.checkbalance());
		
		
		
	}
	
	
}
