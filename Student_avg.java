public class Student_avg

{
    double Comp,Maths,Phy;
    double ans;
   
    void init()
    {
       Comp=100;
       Maths= 99;
       Phy= 97;
       
       
    }
    void calc()
    {
        ans=(Comp+Maths+Phy)/3;
    }
    void display()
    {
        System.out.println("Average ="+ans);
    }
}
    