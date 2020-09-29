
  public class Numbers
{
    int sum=0;
   public int TestNumber(int n)
   {
        for(int i =1;i<=n;i++)
       {
           if(n%i==0)
           {
               sum=sum+i;
            }
        }
        int t=2*n;
        if(sum<t)
        {
            return -1;
            
        }
        else if(sum==t)
        {
            return 0;
        }
        else
        {
           return 1; 
        }
    }
     public void PrintNumberType(int n)
     {
     if(TestNumber(n) == -1)
     {
         System.out.println("It's a deficient number");
        }
     else if(TestNumber(n) == 0)
     {
          System.out.println("It's a perfect number");
        }
     else
     {
          System.out.println("It's an abundant number");
        }
    }
    public static void main()
    {
        Numbers obj= new Numbers();
        obj.PrintNumberType(18);
        
    }
}
         
   
        
 