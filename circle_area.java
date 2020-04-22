class circle_area

{
    double r,ans;
    final double pi=3.14;
    void init()
    {
       
        r=10.5;
       
    }
    void calc()
    {
        ans=pi*r*r;
    }
    void display()
    {
        System.out.println("Area="+ans+"sq cm");
    }
}
    