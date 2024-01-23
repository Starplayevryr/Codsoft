import java.util.*;
import java.lang.*;
class ATM_interface
{
    public static void main(){
        int option,amount=10000;
        System.out.println("----ATM interface----");
        System.out.println("Press 1 for withdrawing");
        System.out.println("Press 2 for depositing");
        System.out.println("Press 3 for checking the balance");
         System.out.println("Press 4 for exiting");
        System.out.println("enter your option");
        Scanner sc=new Scanner(System.in);
        option=sc.nextInt();
        
        while(true)
        {
            switch(option)
            {
                case 1:
                     {
                        
                         amount=withedraw(amount);
                     }
                break;
                case 2:
                    {
                     System.out.println("enter the amount to be deposited");  
                      int deposit=sc.nextInt();
                     depositing(amount,deposit);
                    }
                    break;
                    case 3:
                        
                         balance(amount);
                        
                  break;
                  case 4:
                      System.exit(0);
                  default:
                      System.out.println("invalid choice");
                      
            }
            
        }
        
    }

    public static int withedraw(int amount)
   {
        System.out.println("enter the amount to be withdrawn");
        Scanner sc=new Scanner(System.in);
                         int with=sc.nextInt();
       if(with>amount)
       {
           System.out.println("Insufficient balance");
        }
        else
        {
            amount=amount-with;
        }
       return(amount);    
           
       
    }
    public static int depositing(int amount,int deposit)
    {
        amount=amount+deposit;
        return(amount);
    }
    public static void balance(int amount)
    {
        System.out.println("Current balance : "+amount);
        
    }
}