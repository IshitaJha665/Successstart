
public class calculator1
{
    double a ,b, ans;
    char op;
    calculator1(double n1, double n2, char operator)
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
        ans= a%b;
    }
    void calc()
    {
        if (op =='+')
        {
            add();
        }
        else if(op == '-')
        {
            subtract();
        }
        else if (op == '*')
        {
            multiply();
        }
        else if (op == '/')
        {
            divide();
        }
        else if (op == '%')
        {
            mod();
    }
    }
    void display()
    {
        System.out.println("Answer = " +ans);
    }
    public static void main ()
    {
        calculator1 obj = new calculator1(1728,12,'/');
        obj.calc();
        obj.display();
    }
}

        
            
    