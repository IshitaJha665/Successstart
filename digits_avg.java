import java.util.*;
public class digits_avg
{
    int num,avg;//instance variables
    void readNo()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no.");
        num=sc.nextInt();
    }
    void digitSum()
    {
        int n = num;//local variables
        int sum=0;
        int rem,count=0;
        while(n!=0)
        {
            rem=n%10;//to get the last digit
            sum=sum+rem;
            n=n/10;//will give all the digits except the last digit
            count++;
            System.out.println(count+"\n"+sum);
       }
       avg= sum/count;//finds the average of the digits
       System.out.println("The average of the digits of the number: "+avg);
    }
   public static void main()
   {
       digits_avg obj= new digits_avg();
       obj.readNo();
       obj.digitSum();
    }
}
       