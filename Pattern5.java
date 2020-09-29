/*
 * 1 2 3 4 5 
   1 2 3 4
   1 2 3
   1 2 
   1
 */import java.util.*;
public class Pattern5
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
        for(int i=1;i<=n;i++)
     {
   for(int j=1;j<=n-(i-1);j++)
    {
            System.out.print(" "+j);
        }
     System.out.println();
   }
   }
   public static void main()
    {
        Pattern5 obj= new Pattern5();
        obj.getData();
        obj.generate();
    }
}