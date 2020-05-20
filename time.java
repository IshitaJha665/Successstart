
public class time
{
    double h,m,s,a1,a2,a3;
    double t= 60;//instance variables
    void accept(double hr , double min,double sec)//non static method
    {
        h=hr;
        m=min;
        s=sec;
    }
    void convert()//non static method
    {
        a1= h*t*t;
        a2= m*t;
        a3= s;
    }
    void show_result()//non static method
    {
        System.out.println("Convertion to seconds"+"\n"+"hr to sec ="+a1+"\n"+"min to sec ="
        +a2+"\n"+"sec="+a3);
        
    }
    public static void main()//static method
    {
        time obj = new time();//object creation
        obj.accept(3,25,105);
        obj.convert();
        obj.show_result();
    }
}

        
    