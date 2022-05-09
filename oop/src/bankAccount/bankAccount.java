package bankAccount;

public class bankAccount {

	String accountNum;
	String accountName;
	
	int depositedMoney;
	
	int totalMoney;
	
	static int numberofuser;
	
	public bankAccount(String accountName) {
		System.out.println("This is constructor with string input");
		this.accountName=accountName;
		
	}
	
	public bankAccount(int x) {
		
		System.out.println("This is constructor int input");
	}
	
	
	public bankAccount() {
		System.out.println("This is constructor with no input");
	}
	
	//public static void resetAccount() {
	
		//}
	
	public void deposit() {
		
		System.out.println("Deposit function bankaccount");
	}
	
	public void withdraw() {
		
	}
	
	public void setDueDate() {
		
	}
	
}
