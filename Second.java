import java.util.Scanner;



public class Second implements InterMethods{
static int inHandSalary,press, OTP,interest, loanAmount,EMI, eligibility, tenure, doc, principal, rateInPercent = 10,totalInterestPayable;
Scanner sc = new Scanner(System.in);
    public void welcomePage() {
        System.out.println("Welcome to avail Personal Loan");
        System.out.println("-------------------------------");
        System.out.println("You can avail personal loan for ");
        System.out.println("1. Medical Emergency ");
        System.out.println("2. Debt Consolidation ");
        System.out.println("3. Higher Education");
        System.out.println("4. Home Renovation ");
        System.out.println("5. Used Cars ");
        System.out.println("6. Wedding ");
        System.out.println("7. Travel");
        System.out.println();
        System.out.println("The maximum loan amount is 200000 and the minimum loan amount is 100000");
    }
    
    public void OTPDetails()
    {
    	if(press == 1 || press == 2)
    	{
    	System.out.println("Enter the OTP ");
    	OTP = sc.nextInt();
    	}
    }

    @Override
    public void eligibility(String name, String city, String phNumber, String pan, int age, int sal, int expense) {
        if (city.equalsIgnoreCase("india")) {
            int inHandSalary;
            System.out.println();

            if (age >= 23 && age <= 55) {
                inHandSalary = sal - expense;
                if (inHandSalary > 15000) {
                    if (inHandSalary >= 15000 && inHandSalary <= 30000) {
                        System.out.println("You are eligible to take loan upto 500000");
                    } else if (inHandSalary > 30000 && inHandSalary <= 60000) {
                        System.out.println("you are eligible to take loan upto 100000");
                    } else {
                        System.out.println("you are eligible to take loan upto 200000");
                    }
                    eligibility = 1;
                    System.out.println("Documents Required");
                    System.out.println("1. Salary Pay \n 2. Aadhaar card \n 3. Pan card \n 4. Photographs ");
                    System.out.println("Please press 1 if you have above documents else 2");
                    Scanner sc = new Scanner(System.in);
                    int doc = sc.nextInt();
                    if (doc == 1) {
                        System.out.println("Proceed Further");
                        Four obj = new Four();
                        obj.loanDetails();
                    } else {
                        System.out.println("document  needed");
                    }
                } else {
                    System.out.println("Your In Hand Salary should be greater that 15000 for applying personal loan");
                }
            } else {
                System.out.println("Your age should lie between 23 and 55");
            }
        } else {
            System.out.println("you should reside in INDIA for applying personal loan");
        }
    }




	@Override
	public void loanDetails() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void endMessage() {
		// TODO Auto-generated method stub
		
	}
}
