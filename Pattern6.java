/* 5 4 3 2 1 
   5 4 3 2 
   5 4 3 
   5 4
   5
 */
import java.util.*;
public class Pattern6
{ int n;
  void data()
   {
       Scanner sc= new Scanner(System.in);
       System.out .println("Enter the no. of rows");
       n=sc.nextInt();
    }
    void generate()
    {
        for( int i= 1;i<=n; i++)
        {
       for(int j=1;j<=(n-(i-1));j++)
       {
       System.out.print(" "+(n-(j-1)));
       }
       System.out.println();
    }
  }
  public static void main()
   {
        Pattern6 obj= new Pattern6();
        obj.data();
        obj.generate();
    }
}