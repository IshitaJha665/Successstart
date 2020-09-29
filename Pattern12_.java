/*         1
         1 2
       1 2 3
 */
import java.util.*;
public class Pattern12_
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
       for(int i =1;i<=n;i++)//no. of rows
       {
           for(int j=1;j<=n-i;j++)//no. of elements in each row
           {
               System.out.print(" "+" ");//1st pattern ingredient (Blank Space)
            }
           for(int j=1;j<=i;j++)
            {
                System.out.print(" "+j);//2nd pattern ingredient
            }
            System.out.println();//moves the cursor to the next line
            }
    }
    public static void main()
    {
        Pattern12_ obj= new Pattern12_();
        obj.data();
        obj.generate();
    }
 }