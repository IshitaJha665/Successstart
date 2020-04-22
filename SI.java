class SI
{
    double p,r,t,ans;
    void init()
    {
        p=2000;
        r=3.5;
        t=2;
    }
    void calc()
    {
        ans=p*r*t/100;
    }
    void display()
    {
        System.out.println("SI = Rs."+ans);
    }
}
    