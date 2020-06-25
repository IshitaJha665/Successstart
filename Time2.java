class Time2
{
     private double hr,min,sec,a1,a2,a3;
    double t= 60;//instance variables
    void ACCEPT(double hour , double minute,double seconds)//non static method
    {
        hr=hour;
        min=minute;
        sec=seconds;
    }
    void Convert()//non static method
    {
        a1= hr*t*t;
        a2= min*t;
        a3= sec;
    }
    void showResult()//non static method
    {
        System.out.println("Convertion to seconds"+"\n"+"hr to sec ="+a1+
        "seconds\n" +"min to sec ="+a2+"seconds\n"+"sec ="+a3+"seconds");
        
    }
    public static void main()//static method
    {
        Time2 obj = new Time2();//object creation
        obj.ACCEPT(4,60,105);
        obj.Convert();
        obj.showResult();
    }
}

        
    