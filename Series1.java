
public class Series1
{
    double s=0;
    int i;
    
    void calc()
    {
        for(i=1;i<=10;i++)
        {
            if(i%2==1)
            {
                s=s+(i*2);
            }
            else
            {
                s=s-(i*2);
            }
        }
    }
    void display()
    {
        System.out.println("Sum of series1 = "+s);
    }
    public static void main()
    {
      Series1 obj= new Series1();//object creation
      obj.calc();
      obj.display();
      Series2 obj1= new Series2();//object creation
      obj1.init(5);
      obj1.calc();
      obj1.display();
    }
}
class Series2
 {
    double s=0;
    double i,x1;
    void init(int x)
    {
        x1=x;
    }
    void calc()
    {
        for (i=2;i<=20;i+=3)
        {
            s=s+(x1/i);
        }
    }
    void display ()
    {
        System.out.println("Sum of series2 =" +s);
    }
    
}

    
    
