

public class Circle_constructor
{
  double radius,area;
  final double pi;
    Circle_constructor()//non parameterized constructor
    {
     radius= 10;
     pi=3.14;
    }
    void calc()//non static method
    //called
    {
      area= pi*radius*radius;
    }
    void display()//non static method
    //called
    {
        System.out.println("Area of the circle = "+area);
    }
    public static void main()
    {
        Circle_constructor obj= new Circle_constructor();//object creation
        obj.calc();//caller
        obj.display();//caller
    }
}
        
        

   