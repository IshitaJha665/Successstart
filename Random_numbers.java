
public class Random_numbers
{ 
   double i,a,ans;
   // instance variables 
  void random()
   {
    for(i=1;i<=20;i++)//loop
    {
        a = Math.random();//This math function genereates random numbers 
        ans = a*100;/*between 0.0 to 1.0, So to get random no. between 1 and 100
        we need to multiply it with 100*/
        
        System.out.println(ans);
    }
    System.out.println("20 random numbers are printed above");
  }
  public static void main()
  {
      Random_numbers obj=new Random_numbers();//object creation
      obj.random();
  }
}