/* 1
   2 1 
   3 2 1 
   4 3 2 1
   5 4 3 2 1
 */
import java.util.*;
public class Pattern11
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
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Pattern11 obj= new Pattern11();
        obj.data();
        obj.generate();
        
    }
 }
