class SI_interactive
{
    double p,r,t,ans;
    void init(double prin,double rate,double time)
    {
        p=prin;
        r=rate;
        t=time;
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
    