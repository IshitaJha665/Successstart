
import java.util.*;
public class Sum_Firstlastdigit
{
  int num,ans;
  void getData()
  {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number");
      num=sc.nextInt();
    }
    void calc()
    {
        int n=num;
       
        int last=n%10;
        int first=0;
        while (n!=0)
        {
            first=n%10;
            n/=10;
        }
        ans=first+last;
        
    }
    void display()
    {
        System.out.println("The sum of the first and the last digit= "+ans);
        
    }
    public static void main()
    {
        Sum_Firstlastdigit obj= new Sum_Firstlastdigit();
        obj.getData();
        obj.calc();
        obj.display();
    }
}