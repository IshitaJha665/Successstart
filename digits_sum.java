import java.util.*;
public class digits_sum
{
    int num;
    void readNo()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no.");
        num=sc.nextInt();
    }
    void digitSum()
    {
        int n = num;
        int digit=1;
        int sum=0;
        while(n!=0)
        {
            digit=n%10;//last digit
            sum=sum+digit;
            n=n/10;//will give all the except the last digit
       }
       System.out.println("The sum of the digits in the no. is "+sum);
    }
   public static void main()
   {
       digits_sum obj= new digits_sum();
       obj.readNo();
       obj.digitSum();
    }
}
       