//S=1-2+3-4...n
import java.util.*;
public class Series5
{
    double n,S=0;//instance variables
    void getdata()
    {
        Scanner sc= new Scanner(System.in);
      
        System.out.println("Enter the value for n");
        n=sc.nextInt();
    }
    void compute()
    {
      for(int i=1;i<=n;i++) 
      {
          if(i%2==0)//if the valus of i is even this block will execute
          {
              S=S-i;
            }
            else
            {
                S=S+i;
            }
        }
    }
    
    void display()
    {
        System.out.println("Ans = " +S);
    }
     public static void main()
     {
         Series5 obj=new Series5();//object creation
         obj.getdata();
         obj.compute();
         obj.display();
        }
    }
    
         