/* 1 
   2 3 
   3 4 5 
   4 5 6 7 
   5 6 7 8 9 
   */
import java.util.*;
public class Pattern4_
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
        for(int j=i;j<2*i;j++)//no. of elements in each row
            {
                System.out.print(j+" ");//pattern ingredient
            }
        System.out.println();//moves the cursor to the next line
    }
    }
    public static void main()
    {
        Pattern4_ obj= new Pattern4_();
        obj.getData();
        obj.generate();
    }
}