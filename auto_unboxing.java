

public class auto_unboxing
{
    public static void main()
    {
        Integer a=7;
        int a1=a;//unboxing
        System.out.println(a+"\n"+a1);
        double b= 13.5;
        Double b1= b;//autoboxing
        System.out.println(b+"\n"+b1);
        Character c='I';
        char c1=c;//unboxing
        System.out.println(+c+"\n"+c1);
    }
}