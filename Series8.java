// S= 1+(x/2!).....+x^n/(n+1)!
import java.util.*;
public class Series8

{
      double x,n,a,S=0,total=1;//instance variables
      void getdata()
      {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value for x");
        x=sc.nextInt();
        System.out.println("Enter the value for n");
        n=sc.nextInt();
      }
      int fact(int n) //this method will find out the factorial of the argument of int type passed into it
	{ 
		if (n == 1) 
		{
		return 1; 
               }
               else
               {
		return n * fact(n - 1); 
              }
           }
       void compute()
      {
		for (int i = 1; i <= n; i++) 
		{ 
			total = total + (Math.pow(x, i) / fact(i + 1)); 
		} 
       }
       void display()
       {
           System.out.println("Answer :" +total);
        }
      public static void main() 
	{ 
	    Series8 obj= new Series8();//object creation
	    obj.getdata();
	    obj.compute();
	    obj.display();
	   }
}