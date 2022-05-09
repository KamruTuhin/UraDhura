package carPaymentCalculator;

import java.util.Scanner;

public class CarPaymentV2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter the base price of the car");
		
		double basecarPrice=sc.nextDouble();
		double adminfee =500;
		
		System.out.println("Enter the downpayment of the car");
		double downpayment=sc.nextDouble();
		double tax =7;
		double apr =0;
		double finalfinancePrice;
		double monthlyPayment;
		System.out.println("Enter number of month");
		int month = sc.nextInt();
		System.out.println("Enter credit score....");
		int creditscore =sc.nextInt();
		
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
