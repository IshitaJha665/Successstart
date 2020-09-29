   //WAP to check whether a number is a factorian or not
   //A number which is equal to sum of the factorial of its digit
   class factorian
   {
       int n=1,i;
        int factorial(int m)
       {
        
         int prod=1;
         for(int j=1;j<=m;j++)
          {
            prod*=j;
          }
        return prod;
       }
       int check(int m)
       { 
           int sum=0;
           while(m!=0)
           {
            n=m%10;//gives the last digit
            sum=sum+factorial(n);//sums up the factorials of the digit
            m=m/10;
            
             }
            
           return (sum==i)?1:0;
        }
        void compute ()
        {
            for( i =1;i<=100;i++)
            {
                
                if(check(i)==1)
                {
                    System.out.println(i);
                }
                
            }
        }
        void display()
        {
            System.out.println("These are the factorians between 1 to 100");
        }
        public static void main()
        {
            factorian obj= new factorian();
            obj.compute();
            obj.display();
        }
    }
    
            
       