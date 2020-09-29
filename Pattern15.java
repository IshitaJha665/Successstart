
/* 
   *
   * *
   * * *
   * * * *
   * * * * *
   * * * *
   * * *
   * * 
   * 
 */
import java.util.*;
public class Pattern15
{
    int n;
    void data()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        n= sc.nextInt();
    }
    void generate()
    {for (int i= 0; i<=n-1 ; i++)
        {
            for (int j=0; j<=i; j++) 
            { 
            System.out.print("*"+ " "); 
            } 
            System.out.println(""); 
            } 
            for (int i=n-1; i>=0; i--)
        {
            for(int j=0; j <= i-1;j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
    }
        public static void main()
    {
        Pattern15 obj= new Pattern15();
        obj.data();
        obj.generate();
        
    }
 }