

public class displacement
{
    int u,a,t1,t;
    double S;
    void displacement()//non static method
    {
        u= 20;//m/s
        a =10;//m/s2
        t1= 20; //given:20 min , therefore has to be converted to seconds
        t= 20*60;
    }
    void calc()//non static method
    {
        S=(u*t)+(1/2*a*t*t);
    }
    void display()//non static method
    {
        System.out.println("Displacement = "+S+"m");
    }
    public static void main()//static method
    {
       displacement obj= new displacement();//object creation
        obj.displacement();
        obj.calc();
        obj.display();
    }
}