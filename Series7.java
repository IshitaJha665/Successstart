//Ans= (1+2)/(1*2)+....(1+2+3+...n)/(1*2*3*...n)
import java.util.*;
public class Series7
{
    double S=0,a=0;//instance variables
    double p=1,n;
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
          S=S+i;//keeps on adding the value of i
          p=p*i;//keeps on multiplying the value of i
        }
        a=a+(S/p);
    }
    void display()
    {
        System.out.println("Ans = " +a);
    }
     public static void main()
     {
         Series7 obj=new Series7();//object creation
         obj.getdata();
         obj.compute();
         obj.display();
        }
    }