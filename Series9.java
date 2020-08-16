//Q.30.b) S=(x^3/3!)+x^5/5!....(x^n/n!)
import java.util.*;
public class Series9
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
        for(int i =3; i<=n;i+=2)
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
         Series9 obj=new Series9();//object creation
         obj.getdata();
         obj.compute();
         obj.display();
        }
    }
    