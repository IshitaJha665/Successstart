//Question: S= 1+(1+2)..(1+2..+n)
 import java.util.*;
class Series4
{
    int n,a=0,S=0;//instance variables
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
         a=a+i;
         S=S+a;
        }
    }
    void display()
    {
        System.out.println("Ans = " +S);
    }
     public static void main()
     {
         Series4 obj=new Series4();//object creation
         obj.getdata();
         obj.compute();
         obj.display();
        }
    }
    
         