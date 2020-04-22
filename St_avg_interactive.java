class St_avg_interactive

{
    double m,c,p,ans;
    void init(double maths,double comp,double phy)
    {
       m=maths;
       c=comp;
       p=phy;
      
       
    }
    void calc()
    {
        ans=(m+c+p)/3;
    }
    void display()
    {
        System.out.println("Average="+ans);
    }
}
    