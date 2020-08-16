import java.util.*;
public class digits_product
{
    int num;//instance variable
    void readNo()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no.");
        num=sc.nextInt();
    }
    void digitSum()
    {
        int n = num;//local variables
        int prod=1;
        int rem;
        while(n!=0)
        {
            rem=n%10;//to get the last digit
            prod=prod*rem;
            n=n/10;//will give all the digits except the last digit
       }
       System.out.println("The product of the digits of the number: "+prod);
    }
   public static void main()
   {
       digits_product obj= new digits_product();
       obj.readNo();
       obj.digitSum();
    }
}
       