//S = 2+5+10+17..n
import java.util.*;
public class Series3
{
  int n,S=0;//instance variables
    void getdata()
    {
        Scanner sc= new Scanner(System.in);
       
        System.out.println("Enter the value for n");
        n=sc.nextInt();
    }
    void compute()
    {
        for(int i =1; i<=n;i++)
        {
            S= S+(i*i+1);
        }
    }
    void display()
    {
        System.out.println("Ans = " +S);
    }
     public static void main()
     {
         Series3 obj=new Series3();//object creation
         obj.getdata();
         obj.compute();
         obj.display();
        }
    }
    
          