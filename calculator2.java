
public class calculator2
{
    double a,b,ans;
    char op;
    calculator2(double n1, double n2, char operator)
    {
        a=n1;
        b=n2;
        op=operator;
    }
    void add()
    {
        ans=a+b;
    }
    void subtract()
    {
        ans= a-b;
    }
    void multiply()
    {
        ans= a*b;
    }
    void divide()
    {
        ans= a/b;
    }
    void mod()
    {
        ans=a%b;
    }
    
    void calc()
    {
        switch (op)
        {
            case '+':
            add();
            display();
            break;
            case '-':
            subtract();
            display();
            break;
            case '*':
            multiply();
            display();
            break;
            case '/':
            divide();
            display();
            break;
            case '%':
            mod();
            display();
            default:
            System.out.println("Invalid operator");
            break;
           
        }
    }
    void display()
        {
            System.out.println("Answer = " +ans);
        }
    public static void main()
    {
      calculator2 obj = new calculator2(1728,12,'/');
      obj.calc();
      
    }
}
        
            