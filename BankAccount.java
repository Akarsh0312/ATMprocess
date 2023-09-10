import java.util.Scanner;

public class BankAccount {

        public static void main(String args[]){

            int bal= 75000, withdraw, deposit;
            Scanner sc= new Scanner( System.in );
            while(true){
    //            try{Thread.sleep(100);}catch(InterruptedException e){System.out.println(e);}  
                System.out.println("YOU'RE WELCOME");
                System.out.println("NOW YOU CAN PROCEED TO USE OUR SERVICES");
                System.out.println("PRESS 1 TO WITHDRAW MONEY");
                System.out.println("PRESS 2 TO DEPOSIT THE MONEY");
                System.out.println("PRESS 3 TO CHECK BALANCE");
                System.out.println("PRESS 4 TO EXIT");
                System.out.println("SELECT THE OPERATION YOU WANT TO PERFORM");
                int choice= sc.nextInt();
                switch(choice){
                    case 1:
                    System.out.println("ENTER THE AMOUNT TO BE WITHDRAWN");
                    withdraw = sc.nextInt();
                    if( bal >= withdraw){
                        bal= bal-withdraw;  
                        System.out.println("PLEASE COLLECT YOUR AMOUNT");
                        }
                        else{
                            System.out.println("SORRY, YOUR REQUEST IS REJECTED");
                            System.out.println("AS YOU HAVE INSUFFICIENT BALANCE");
                        }
                        System.out.println("");
                        break;
                        case 2:
                        System.out.println("ENTER THE AMOUNT TO BE DEPOSITED");
                        deposit = sc.nextInt();
                        bal = bal + deposit;
                        System.out.println("YAAY , YOUR MONEY HAS BEEN SUCCESSFULLY DEPOSITED");
                        System.out.println("");
                        break;
                        case 3:
                        System.out.println("Balance :"+ bal);
                        System.out.println("");
                        break;
                        case 4:
                        System.out.println("PLEASE VISIT AGAIN....");
                        System.exit( 0);
                    
                }
            }
        }
}