import java.util.*;
public class ParkingLot
{
   int vno,hours;
   double bill;
   void input()
   {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the vehicle number: ");
      vno=sc.nextInt();
      System.out.println("Enter the number of hours: ");
      hours=sc.nextInt();
    }
    void calculate()
    {
        if(hours==1)
        {
            bill=3;
        }
        else
        {
            bill= (1.5*(hours-1))+3;
        }
    }
    void display()
    {
        System.out.println("The bill = "+bill);
    }
    public static void main()
    {
        ParkingLot obj= new ParkingLot();
        obj.input();
        obj.calculate();
        obj.display();
        
    }
}