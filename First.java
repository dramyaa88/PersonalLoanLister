import java.util.Scanner;



public class First extends Second{
	
	public static void main(String[] args) throws Exception
    {
        Second obj = new Second();
        Third obj2 = new Third();
        Four obj3 = new Four();
        MySQLclass obj6 = new MySQLclass();
        Scanner sc = new Scanner(System.in);

        obj.welcomePage();
        System.out.println("Already a member press 1 else 2");
        press = sc.nextInt();
        
        if(press == 2)
        {
        	
        System.out.println("Enter your Name");
        String name = sc.nextLine();
        obj2.setName(name);
        
        System.out.println("Enter your UserId");
        String uid = sc.nextLine();
        obj2.setUid(uid);
        
        System.out.println("Set Password");
        String pwd = sc.nextLine();
        obj2.setPwd(pwd);
        
        System.out.println("Enter your country");
        String city = sc.nextLine();
        obj2.setCity(city);

        System.out.println("Enter your Mobile number");
        String phNumber = sc.nextLine();


        //Regular expression to accept valid phone number
        String regex = "\\d{10}";
        
        //Matching the given phone number with regular expression
        boolean result = phNumber.matches(regex);
        
        if(result) {
            System.out.println("Given phone number is valid");
        } else {
            System.out.println("Given phone number is not valid");
            System.exit(0);
        }
        obj2.setPhonenumber(phNumber);
        System.out.println("Enter your PAN Number");
        String pan = sc.nextLine();
        obj2.setPan(pan);
        System.out.println("Enter your Age");
        int age = sc.nextInt();
        sc.nextLine();
        obj2.setAge(age);
        System.out.println("Enter Monthly Salary");
        int sal = sc.nextInt();
        sc.nextLine();
        obj2.setSal(sal);
        System.out.println("Enter your expenses");
        int expense = sc.nextInt();
        sc.nextLine();
        obj2.setExpense(expense);
        
        obj.eligibility(obj2.getName(), obj2.getCity(), obj2.getPhonenumber(), obj2.getPan(), obj2.getAge(),obj2.getSal(), obj2.getExpense());
        if(OTP == 1)
        {
        
        obj3.endMessage();
        obj6.selectDepartment();
        }
        }
        else if(press == 1)
        {
        	System.out.println("Enter your UserId");
        	String uid = sc.nextLine();
        	obj2.setUid(uid);
        	
        	System.out.println("Enter your Password");
            String pwd = sc.nextLine();
            obj2.setPwd(pwd);
        	
        }
        else
        {
        	System.out.println("Invalid option");
        }
      //  obj.eligibility(name,city,phNumber,pan,age,sal,expense);
        
    }
}
