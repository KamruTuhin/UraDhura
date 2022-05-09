package pack2;

public class runFacebook {

	public static void main(String[] args) {
		
		facebook mike = new facebook();
		facebook john = new facebook();
		facebook x = new facebook();
		facebook y = new facebook();
		
		//int x;
		
		//x=67;
		
		facebook.countUserNumber();
		
		// facebook mike = new facebook();
		//mike.post();
		//mike.chat();
		
		mike.username="mike23";
		
		
		//facebook john = new facebook();
		//john.call();
		//john.post();
		
		john.username="john100";
		
		System.out.println(mike.username);
		System.out.println(john.username);

		System.out.println(mike.password);
		System.out.println(john.password);
		
		mike.printUsername();
		john.printUsername();
		
	}

}
