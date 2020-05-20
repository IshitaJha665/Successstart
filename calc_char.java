public class calc_char
{
    int n,n1,ans;
    char c;
    void num_calc(int num , char ch)
    {
        n=num;
        c=ch;
        if(c=='s')
        {
            ans= num*num;
            
        }
        else
        {
            ans= num*num*num;
            
        }
        System.out.println("Input:" + num+","+ch+"\n"+ "Ans= "+ans);
    }
    void num_calc(int a , int b, char ch)
    {
        n= a;
        n1=b;
        c=ch;
        if(c == 'p')
        {
           ans = a*b;
        }
        else
        {
            ans= a+b;
            
        }
        System.out.println("Input:" + a+","+b+","+ch+"\n"+ " Ans ="+ans);
    }
    public static void main()
    {
        calc_char obj= new calc_char();//object creation
        obj.num_calc(6,7,'p');
        obj.num_calc(4,'i');
    }
}

        
        