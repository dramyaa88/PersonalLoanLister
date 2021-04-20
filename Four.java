import java.util.Scanner;



public class Four extends Second implements InterMethods{
	@Override
    public void loanDetails() {
		
        if (eligibility == 1) {
            System.out.println("Enter the loan Amount");
            Scanner sc = new Scanner(System.in);
            loanAmount = sc.nextInt();
            System.out.println("Enter the tenure in months");
            tenure = sc.nextInt();
            principal =loanAmount;
            System.out.println(principal);
            try
            {
                totalInterestPayable = (principal * tenure * rateInPercent) / 100;
                EMI = (principal + totalInterestPayable) / tenure;
                System.out.println("Interest :"+EMI);
                System.out.println("Total Amount :"+(principal+EMI));
            }catch(ArithmeticException e)
            {
            	e.printStackTrace();
            }
                

        }

    }

    public void endMessage() {
      
            System.out.println("You successfully applied for the loan");
            System.out.println("Have a nice day");
        
    }
}
