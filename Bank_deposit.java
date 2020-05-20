public class Bank_deposit
{
   
    
    void term_deposit(double P,double r,double n)//non static method 
    {
        double m_amt=P*(Math.pow (1+r/100,n));
        System.out.println("The maturity value of term deposit = " + m_amt);
    }
    void recurring_deposit(double P ,double r,double n)//non static method 
    {
        double m_amt = P*n+(P*(n*(n+1))/2)*(r/100)*1/12;
        System.out.println("The maturity value of recurring deposit = " + m_amt);
    }
    public static void main (int deposit_typeno)
      {
       Bank_deposit obj= new Bank_deposit();//object creation
       
       switch(deposit_typeno)
        {
            case 1:
            obj.term_deposit (40000,7,4);//here n is in years 
            break;
            case 2:
            obj.recurring_deposit(40000,7,48);//here n is in months
            break;
            default:
            System.out.println("The input is invalid");
            break;
        }
       }
   }
            
            
           
            