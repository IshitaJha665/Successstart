public class area_rectangle
{
    int l,b,ans;//instance variables
    
        void init()
        {
            l=10;
            b=20;
        }
        void calc()
        {
            ans=l*b;
        }
        void display()
        {
            System.out.println("Area ="+ans+"sq cm");
        }
        public static void main()
        {
            area_rectangle obj= new area_rectangle();
            obj.init();
            obj.calc();
            obj.display();
        }
    }
        
       
            