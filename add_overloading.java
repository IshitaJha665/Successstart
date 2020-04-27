
public class add_overloading
{
   
    int add(int a , int b)//interactive
    {
       System.out.println("It's data type is int"+ ( a+b));
      return a+b;
        
    }
    double add(double a , double b)
    {
        System.out.println( "It's data type is double "+ (a+b));
        return a+b;//it will return the value
    }
  public static void main ()
   {
       add_overloading obj = new add_overloading();
       obj.add(31.7,6.5);//It is of double add
       obj.add(6,13);//It is of int add
    }
}