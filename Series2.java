//S= x/1!+(x^2/2!)..x^n/n!
import java.util.*;
public class Series2
{
   
    double x,n,S=0;//instance variables
    void getdata()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value for x");
        x=sc.nextInt();
        System.out.println("Enter the value for n");
        n=sc.nextInt();
    }
    int factorial(int m)//this method will find out the factorial of the argument of int type passed into it
    {
        int prod=1;
        for(int i=1;i<=m;i++)
        {
            prod*=i;
        }
        return prod;
    }
    
    void compute()
    {
        for(int i =1; i<=n;i++)
        {
            S= S+Math.pow(x,i)/factorial(i);
        }
    }
    void display()
    {
        System.out.println("Ans = " +S);
    }
     public static void main()
     {
         Series2 obj=new Series2();//object creation
         obj.getdata();
         obj.compute();
         obj.display();
        }
    }