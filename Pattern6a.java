/* 5 4 3 2 1 
   5 4 3 2 
   5 4 3
   5 4 
   5
 */
import java.util.*;
public class Pattern6a
{
   int n;
   void data()
   {
       Scanner sc= new Scanner(System.in);
       System.out .println("Enter the no. of rows");
       n=sc.nextInt();
    }
    void generate()
    {
        for(int i=1;i<=n;i++)
        {
        
            for(int j=n;j>=i;j--)
            {
             System.out.print(j+ " ");
            }
           System.out.println();
        }//1st for
    }
    public static void main()
    {
        Pattern6a obj= new Pattern6a();
        obj.data();
        obj.generate();
    }
}
