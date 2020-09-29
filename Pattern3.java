/*1
  1 2
  1 2 3 
  ..n
 */
import java.util.*;
public class Pattern3
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
                System.out.print(" "+j);//pattern ingredient
            }
        System.out.println();//moves the cursor to the next line
    }
    }
    public static void main()
    {
        Pattern3 obj= new Pattern3();
        obj.getData();
        obj.generate();
    }
}
        