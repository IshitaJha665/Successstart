public class floyd_triangle1
{
    int count =0,x;
 void init(int n)//formal parameter
 {
     x=n;
    }
 void floyd() //non static method
    { 
        int a,b, value = 1; 
        for (a = 1; a <= x; a++) 
        { 
            for (b = 1; b <= a; b++) 
            { 
                count++;//increment operator
                System.out.print(count + " "); 
                 
            } 
            System.out.println(); //This is to bring the cursor on the next line
                  
        } 
    } 
 public static void main(String[] args)  //static method
   { 
        floyd_triangle1 obj = new floyd_triangle1();//object creation
        obj.init(4);//actual parameter
        obj.floyd();
        
        
  } 
} 