 import java.util.*;
public class num_of_digits
{
    int num,count;
    void readNo()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no.");
        num=sc.nextInt();
    }
    void digitSum()
    {
        int n = num;
        int sum=0;
        while(n!=0)
        {
           
            n=n/10;//will give all the except the last digit
            count++;
       }
       System.out.println("The sum of the digits in the no. is "+count);
    }
     public static void main()
    {
       num_of_digits obj= new  num_of_digits();
       obj.readNo();
       obj.digitSum();
    }
}