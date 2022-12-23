package override;

public class caculation {
	
	 public void Add(int a ,int b )//2 
	{
		 System.out.println(a+b);
		
	}
	 public void Add(int a ,int  b,int c)///3
		{
			System.out.println(a+b+c);
		}
	 
	 public void Add(int a,int b,int c,int d)
	 
	 
	 {
		 System.out.println(a+b+c+d);
	 }
	 
	 public static void main(String[] args) {
		 
		 caculation cal=new caculation();
		 cal.Add(10,20);
		 cal.Add(10,20,30);
		 cal.Add(10,20,30, 40);
		 
		
		 
		 
		
	}

}

//add(int a, int b)
//add(int b,int a)




