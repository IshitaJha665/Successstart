
public class Student
{
  int r,m,comp,p,c,e;
  double per;
  String n;//instance variables 
   void init(String name , int roll_no ,int maths,int computers,
    int phy ,int chem,int eng)//non static method (belongs to object)
    {
        n=name;
         r=roll_no;
         m=maths;
         comp=computers;
         p=phy;
         c=chem;
         e=eng;
         
    }
    void calc()//non static method 
    {
        double total= m +comp +p +c +e;//calculates total marks obtained
        double perc=total/500*100;//calculates percentage 
        per=perc;
        if (perc>=90)//else if ladder is used here
        {
            System.out.println("Science with Computers");
        }
        else if (perc<=89||perc>=80)
        {
            System.out.println("Science without Computers");
        }
        else if (perc<=79||perc>=70)
        {
            System.out.println("Commerce with Maths");
        }
        else if(perc<=69||perc>=60)
        {
            System.out.println("Commerce without Maths");
        }
        else
        {
            System.out.println("Not eligible");
    }
  }
 void display ()//non static method 
    {
    System.out.println("Roll Number:" + r +"\t Name: "+n);
    System.out.println("Percentage :"+per+" %");
   }
  public static void main ()
  {
    Student obj= new Student();//object creation
    obj.init("Ishita Jha",5,100,100,99,98,100);
    obj.calc();
    obj.display();
  }
}
    
    
    
        