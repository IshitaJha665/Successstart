/*
   * * *
     * *
       *
 */
import java.util.*;
public class Pattern14
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
           System.out.print(" "+"*");
          }
            System.out.println();
        }
    }
     public static void main()
    {
        Pattern14 obj= new Pattern14();
        obj.data();
        obj.generate();
        
    }
 }
