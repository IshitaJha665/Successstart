
/* A
 * b b
 * C C C
 * d d d d
 * E E E E E
 */
import java.util.*;
public class Pattern8
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
        char a ='A';
        for(int i =0;i<=n;i++ )
     {
       for(int j=0;j<=i;j++)
            {
                if(a%2==0)
                {
                System.out.print(Character.toLowerCase(a)+ " ");
            }
                else
                {
                    System.out.print(Character.toUpperCase(a)+" "); 
                }
            
            }
        a++;
    System.out.println();
   }
}

       public static void main()
    {
        Pattern8 obj= new Pattern8();
        obj.getData();
        obj.generate();
    }
}

        