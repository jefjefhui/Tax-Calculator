// A1, Chi Heng Jeffrey Hui, CIS 340, T Th 3:00 PM
import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		double grossIncome = 0.0;
		int deduction =0;
		double netIncome =0.0 ; 
		double federalTax =0.0;
		double stateTax =0.0;
		String filingStatus = "";
		Scanner scanner = new Scanner (System.in );
		System.out.println("\t\t\tIncome Tax Calculator");
		System.out.println("\nThis program will calculate your income tax.");
		System.out.print("\nWhat is your gross imcome? ");
	    grossIncome = Double.parseDouble (scanner.nextLine());
	    
	    System.out.println("\nFILING STATUS.");
	    System.out.println("Single - SG");
	    System.out.println("Married Joint - MJ ");
	    System.out.println("Married Separately - MS");
	    System.out.println("Head of Household - HH");
	    
	    
	    System.out.print("\nEnter the two letter code corresponding with your status:");
	    filingStatus = scanner.nextLine();
	    
	    if (filingStatus.equals("SG") )
	    {
	    	deduction = 5950;
	    }
	    else if (filingStatus.equals ("MJ"))
	    { 
	    	deduction = 11900;
	    }
	    else if (filingStatus.equals ("MS"))
	    {
	    	deduction = 5950;
	    }
	    else if (filingStatus.equals("HH"))
	    {
	    	deduction = 8700;
	    }
	    else
	    {
	    	deduction = 0;
	    }
	    		
	    netIncome = grossIncome - deduction ; 
	    
	   if (netIncome < 30000)
	   {
		   federalTax = 0;
	   }
	   else if  (netIncome>= 30000 && netIncome< 60000 )
	   {
		   federalTax = netIncome * 0.1;
	   }
	   else if (netIncome >= 60000 && netIncome< 100000)
	   {
		   federalTax = netIncome * 0.2;
	   }
	   else if ( netIncome >= 100000 && netIncome < 250000)
	   {
		   federalTax = netIncome * 0.3;
	   }
	   else 
	   {
		   federalTax = netIncome * 0.4;
	   }
	   
	   stateTax = netIncome* 0.025;
	   
		
	   System.out.printf( "\nYour stated income was $%.2f.", grossIncome   );
	   
	   double finalIncomeTax =0.0;
	   finalIncomeTax = federalTax +stateTax;
	   
	   System.out.printf( "\nYour final tax liability is $%.2f.",finalIncomeTax);
	   
	   
		
		
		
		
		
		
		
		
		
		
		

	}

}
