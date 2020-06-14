
public class SI_constructor
{
    double p,r,t,ans;
    SI_constructor()//non parameterized constructor
    {
        p=10000;
        r=5;
        t=2;
    }
    void calc()//non static method
    //called
    {
        ans=p*r*t/100;
    }
    void display()//non static method
    //called 
    {
        System.out.println("SI = Rs."+ans);
    }
    public static void main()
    {
        SI_constructor obj= new SI_constructor();//object creation
        obj.calc();//caller
        obj.display();//caller
    }
}
    