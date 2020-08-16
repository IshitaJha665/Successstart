//Q: S= 1+x+x^2...x^n
import java.util.*;
public class Series_one
    {
    int x,n,S=0;//instance variables
    void getdata()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value for x");
        x=sc.nextInt();
        System.out.println("Enter the value for n");
        n=sc.nextInt();
    }
    void compute()
    {
        for(int i =0; i<=n;i++)
        {
            S+=Math.pow(x,i);
        }
    }
    void display()
    {
        System.out.println("Ans = " +S);
    }
     public static void main()
     {
         Series_one obj=new Series_one();//object creation
         obj.getdata();
         obj.compute();
         obj.display();
        }
    }
    
         