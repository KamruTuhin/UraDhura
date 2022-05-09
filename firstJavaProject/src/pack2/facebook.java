package pack2;

public class facebook {
	
	 String username;
	 String password;
	 
	 
	 //Constructor
	 //to construct an object constructor is created
	 //multiple constructor is created
	 //constructor overloading
	 public facebook(String username,String password) {
		 
		 this.username=username;
		 this.password=password;
		 
	 }
	
	 
	 
	 public facebook(String x,String y) {
		username=x;
		
	}
	
	
	public facebook(int x) {
		
		System.out.println(x);
				
	}
	 
	public facebook() {
		
	System.out.println("an object is created");
				
	}	  
	 
	 
	 public static void countUserNumber() {
		 
		 System.out.println("number of users");
	 }
	 
	 
	 
	 public void printUsername() {
		 
		 String username=("test123");
		 System.out.println(this.username);
		 
	 }
	
	
	public void post() {
		
		System.out.println("posting content");
	}

	public void like() {
		
		System.out.println("like content");
	}
	
	public void chat() {
		
		System.out.println("start talking");
	}

	public void call() {
		
		System.out.println("this is first calling");
	}
	
	public int call(String x) {
		
		System.out.println("this is second calling");
		return 12;
	}

}
