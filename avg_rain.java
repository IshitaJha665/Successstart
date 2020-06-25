
public class avg_rain
{
    double april,may,june,ans;// instance variables 
    avg_rain()//no argument constructor
    {
      april=12;//values are being initialised
      may=14;
      june=8;
    }
    void calc()//called
    {
        ans=(april+may+june)/3;
    }
    void dis()//called
    {
        System.out.println("Rainfall for April = \t"+april+" cm");
         System.out.println("Rainfall for May = \t"+may+" cm");
          System.out.println("Rainfall forJune = \t"+june+" cm");
           System.out.println("Average Rainfall = \t"+ans+" cm");
          
    }
    public static void main()
    {
        avg_rain o= new avg_rain();//obj creation
        o.calc();//caller
        o.dis();//caller
    }
}
  