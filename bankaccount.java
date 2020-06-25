
public class bankaccount
{
     String name1;
     long acc;
     String acc_type;
     double balance;// instance variables
    bankaccount()//default constructor
    {
        name1="";
        acc=0;
        acc_type="";
        balance= 0;
    }
    void p_info(String name,long account_number,String account_type,double amt )
    {
        name1= name;
        acc=account_number;
        acc_type= account_type;
        balance = amt;
            System.out.println("Name : " + name1+"\nAccount number : "+acc+"\nAccount type : "+acc_type+" \nBalance : "+balance);
    }
    
   double deposit(double deposit)
    {
        balance+=deposit;
        return balance;
    }
   double withdraw(double amount)
    {
        if (balance>amount)
        {
         balance-=amount;
        
    }
    else
    {
        System.out.println("Balance is insufficient");
    }
    return balance;
    }
   public static void main()
   {
       bankaccount o= new bankaccount();
       o.p_info("Ishita",958036741,"Saving",1000000);
  
       
       System.out.println("Current balance : " + o.deposit(650000));
       System.out.println("Remaining balance : " +o.withdraw(400000));
    }
}