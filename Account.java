
class Account
{
    double balance;// instance variables
    Account()//default constructor
    {
        balance= 0;
    }
    void start(double amt)
    {
        balance= amt;
    }
   double deposit(double amount)
    {
        balance+=amount;
        return balance;
    }
   double withdraw(double amount)
    {
        balance-=amount;
        return balance;
    }
   public static void main()
   {
       Account o= new Account();
       o.start(100000);
       System.out.println("Current balance = " + o.deposit(65000));
       System.out.println("Remaining balance = " +o.withdraw(40000));
    }
}
       
        
        
        