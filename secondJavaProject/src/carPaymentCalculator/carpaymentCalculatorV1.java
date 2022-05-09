package carPaymentCalculator;

public class carpaymentCalculatorV1 {

	public static void main(String[] args) {
		
		double basecarPrice=20000;
		double adminfee =500;
		double downpayment=4000;
		double tax =5;
		double apr =0;
		double finalfinancePrice;
		double monthlyPayment;
		
		int month = 60;
		
		int creditscore =600;
		
		double totalPrice=0;
		
		double financePrice;
		
		double taxpay=0;
		
		taxpay=(basecarPrice+adminfee)*(tax/100);
		
		totalPrice=basecarPrice+adminfee+taxpay;
		
		financePrice=totalPrice-downpayment; 
		 
		System.out.println(totalPrice);
		
		System.out.println(financePrice);
		
		if (creditscore>750) {
			apr=1.5;
		}
		
		if (creditscore<750 && creditscore>=650) {
			
			apr=2.5;
		}
		
		if (creditscore<650 && creditscore>=600) {
		
		 apr=3;

	}

		System.out.println(apr);
		
		finalfinancePrice = financePrice + financePrice*(apr/100);
		monthlyPayment=finalfinancePrice/month; 
		
		System.out.println("Monthly payment is ....");
		
		System.out.println("monthlyPayment");
	}
	} 
