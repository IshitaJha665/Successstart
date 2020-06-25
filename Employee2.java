

public class Employee2
{
    int pan;
    String name1;
    double taxincome;
    double tax;// instance variables 
   void input(int p_acc_no, String name,double taxable_income )/*parmeterized
   function*/  //called
   {
     pan= p_acc_no;
     name1=name;
     taxincome= taxable_income;
    }
   double calc()//called
    {
       if(taxincome<100000)
       {
           tax=0;
        }
        else if(taxincome>=100001 && taxincome<=150000)
        {
            tax=(taxincome-100000)*(10/100);
        }
        else if(taxincome>=150001 && taxincome <= 250000)
        {
            tax=5000+((taxincome-150000)*(20/100));
        }
        else 
        {
            tax= 25000+((taxincome-250000)*(30/100));
        }
        return tax;
    }
    void display()//called
    {
        System.out.println("PAN Number\tName\tTaxable income\tTax");
        System.out.println(pan+"\t\t"+name1+"\t"+taxincome+"\t"+tax);
    }
    public static void main()
    {
        Employee2 obj=new Employee2();//object creation
        obj.input(56713,"Iris",400000);//caller
        obj.calc();//caller
        obj.display();//caller
    }
}

        
        
        
            
        

   