public class area_overloading
{
    final double pi=3.14;
    
    void area(double r)
    {
        double circle = pi*r*r;
        System.out.println("Area of circle = "+circle+ " sq cm");
    }
    void area(float s)
    {
         System.out.println("Area of square = " +Math.pow (s,2)+ "sq.cm");
        }
    void area (double l,double b)
    {
        System.out.println("Area of rectangle ="+ l*b+ " sq.cm");
    }
    public static void main ()
    {
        area_overloading obj = new area_overloading();
        obj.area(99f);//float
        obj.area(2.5,6.5);//double,double
        obj.area(2.7);//double
    }
}
    
        
        
        
    