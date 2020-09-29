/* 5 4 3 2 1 
     5 4 3 2 
       5 4 3 
         5 4 
           5
 */
import java.util.*;
public class Pattern13
{
    int n;
    void data()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        n= sc.nextInt();
    }
    
    
    void generate()
    {
        for(int i=1;i<=n;i++)//no. of rows
        {
           for(int j=1;j<=i-1;j++)//no. of elements in each row
           {
               System.out.print("  ");//1st pattern ingredient (Blank Space)
            }
            
          for(int j=1;j<=(n-(i-1));j++)
          {
           System.out.print("  "+(n-(j-1)));
          }
            System.out.println();//moves the cursor to the next line
        }
    }
    public static void main()
    {
        Pattern13 obj= new Pattern13();
        obj.data();
        obj.generate();
        
    }
 }
