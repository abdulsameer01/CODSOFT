import java.util.Scanner;

public class atminterface {
    public static void main(String args[])
    {
        int balance = 10000;
        int takeamount = 0;
        int addamount = 0;
        int password = 1234;
        System.out.println("\t\t\tABD ATM\t\t\t");
        System.out.println("enter your password:");
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        System.out.println("Enter your name:");
            String name = sc.next();
            System.out.println("Welcome "+name);
        while(true)
         {
            if (pin==password)
            {
             
            System.out.println("\n\t\t\tPress 1.CHECK BALANCE.");
            System.out.println("\t\t\tPress 2.WITHDRAWAL."); 
            System.out.println("\t\t\tPress 3.DEPOSIT.");
            System.out.println("\t\t\tPress 4.RECEIPT"); 
            System.out.println("\t\t\tPress 5.EXIT");
            int choice;
            choice = sc.nextInt();
            switch(choice){
                case 1:{
                    System.out.println("BALANCE:"+balance);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the amount:");
                    takeamount = sc.nextInt();
                    if(takeamount>balance){
                        System.out.println("INSUFFICIENT AMOUNT");
                    }
                    else{
                        System.out.println("TRANSACTION SUCCESSFUL");
                        balance = balance-takeamount;
                        break;
                    }
                }
                case 3:
                {
                    System.out.println("Enter the amount:");
                    addamount = sc.nextInt();
                    System.out.println("Amount Credited Successfully.");
                    balance = balance + addamount;
                    break;
                }
                case 4:
                {
                     System.out.println("\t\t\t\tWELCOME TO ABD ATM");
                     System.out.println("\t\tRECEIPT:");
                     System.out.println("WITHDRAWAL:"+takeamount);
                     System.out.println("DEPOSIT:"+addamount);
                     System.out.println("BALANCE:"+balance);
                     System.out.println("THANK YOU");
                }
                case 5:
                {
                    System.out.println("THANK YOU");
                    break;
                }
            } 

                

        }
    }

}
    
}
