
//S=2!-4!+6!-8!..n!
import java.util.*;
public class Series6
{
    double n,S=0;//instance variables
    void getdata()
    {
        Scanner sc= new Scanner(System.in);
        
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
        for(int i =2; i<=n;i+=2)
        {
           if(i%4==0)//checks whether i is a multiple of 4,if true then its block wil execute
           {
               S=S-factorial(i);
            }
            else
            {
                S=S+factorial(i);
            }
        }
    }
    void display()
    {
        System.out.println("Ans = " +S);
    }
     public static void main()
     {
         Series6 obj=new Series6();//object creation
         obj.getdata();
         obj.compute();
         obj.display();
        }
    }
    