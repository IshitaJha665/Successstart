/* 1 
 * 2 2 
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 */ 
import java.util.*;
public class Pattern2
{
    int n ;
    void getData()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows for the pattern");
        n=sc.nextInt();
    }
    void generate()
    {
        for(int i=1;i<=n;i++)//no. of rows
        {
            for(int j=1;j<=i;j++)//no. of elements in each row
            {
                System.out.print(" "+i);//pattern ingredient
            }
            System.out.println();//moves the cursor to the next line
        }
        
    }
    public static void main()
    {
        Pattern2 obj= new Pattern2();
        obj.getData();
        obj.generate();
    }
}
        