

public class Employee
{
    String n;//instance variables
    float base_salary,total_salary;
    void init(String name, float salary)//calling
    {
        n=name;//assigning the value of name to variable 'n'
        base_salary = salary;/*assigning the value of salary 
        to variable 'base_salary'*/
    }
    void calc()//calling
    {
        total_salary= (50/100f* base_salary)+base_salary;//calcuting salary
    }
    void display()//calling
    {
        System.out.println("The name of the employee is "+n);//Print the employee name 
        System.out.println("Salary amt = "+ total_salary);/*This will print 
       the calculated salary*/
    }
    public static void main()
    {
        Employee obj= new Employee();//caller//object creation
        obj.init("Ishita",500000f);//f since data type is float
        obj.calc();
        obj.display();
    }
}