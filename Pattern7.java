
/*
  1 
  2 3 
  4 5 6 
  7 8 9 10 
  11 12 13 14 15 

 */
import java.util.*;
public class Pattern7
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
     int count=0;
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
               count++;
               System.out.print(count+" ");
        }
         System.out.println();
    }
}
     public static void main()
    {
        Pattern7 obj= new Pattern7();
        obj.getData();
        obj.generate();
    }
}
