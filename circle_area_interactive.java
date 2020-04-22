
public class circle_area_interactive


{
    double r,ans;
    final double pi=3.14;
    void init(double radius)
    {
       
        r=radius;
       
    }
    void calc()
    {
        ans=pi*r*r;
    }
    void display()
    {
        System.out.println("Area="+ans);
    }
}
    