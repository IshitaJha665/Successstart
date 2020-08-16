import java.util.*;
  class Cybercafe_bill
{
    double bill;
    int usage;
    void getdata()
    {
        Scanner sc= new Scanner(System.in);
      System.out.println("Enter the time you used the internet in mins");
      usage=sc.nextInt();
    }
    void calc()
    {
        if(usage>0&&usage<=60)
        {
            bill=20;
        }
        else if(usage>60&&usage<=90)
        {
            bill=20+12;
        }
        else if (usage>90&&usage<=90)
        {
         bill= 20+12+8;
        }
        else
        {
            bill=20+12+8+((usage-105)*2);
        }
    }
    void dis()
        {
            System.out.println("Bill in Rs. = "+bill);
        }
        public static void main()
        {
            Cybercafe_bill obj= new Cybercafe_bill();
            obj.getdata();
            obj.calc();
            obj.dis();
            
            
            
        }
    }
    
            
        
      
    
          
      