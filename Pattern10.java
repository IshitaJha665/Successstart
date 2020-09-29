
/*  * * * * *
    * * * *  
    * * *
    * * 
    * 
 */
import java.util.*;
public class Pattern10
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
        for(int j=n; j>=i;j--)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    
    }
    public static void main()
    {
        Pattern10 obj= new Pattern10();
        obj.data();
        obj.generate();
    }
}