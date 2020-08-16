import java.util.*;
public class Reverse_no
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
        int rev=0;
        int rem;
        while(n!=0)
        {
            rem=n%10;//to get the last digit
            rev=rev*10+rem;
            n=n/10;//will give all the digits except the last digit
       }
       System.out.println("Reversed number: "+rev);
    }
   public static void main()
   {
       Reverse_no obj= new Reverse_no();
       obj.readNo();
       obj.digitSum();
    }
}
       