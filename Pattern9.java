/*
  5 5 5 5 5
  5 4 4 4 4
  5 4 3 3 3
  5 4 3 2 2
  5 4 3 2 1
 */
import java.util.*;
public class Pattern9
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
            for(int j=1;j<=i;j++)
            {
                System.out.print(" "+ (n-(j-1)));
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" "+(n-(i-1)));
            }
            
            System.out.println();//moves the cursor to the next line
        }
    }
    public static void main()
    {
        Pattern9 obj= new Pattern9();
        obj.data();
        obj.generate();
        
    }
 }