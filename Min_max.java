
public class Min_max
{
   int t1=0;//instance variable
   void maxx(int a,int b,int c,int d,int e,int f,int g,int h,int k)//non static method;calling 
   {
     int[][] array={{a,b,c},{d,e,f},{g,h,k}};//matrix array 3x3
     int max=array[0][0];
     for(int i=1;i<array.length;i++)
     { 
         for(int j=0;j<3;j++)//nested loop
         {
         if(array[i][j]>max)
         {
           t1= max;
           max=array[i][j];
          }
        }
    }
    System.out.println("Maximum number= "+max);//This wll print the maximum number
}
    void minn(int a,int b,int c,int d,int e,int f,int g,int h,int k)//non static method ;calling
{
    int [][] array={{a,b,c},{d,e,f},{g,h,k}};
    int min=array[0][0];
    for(int i=1;i<array.length;i++)
     {
           for(int j=0;j<3;j++)//nested loop
           {
               if(array[i][j]<min)
               {
                   t1=min;
                   min=array[i][j];
                }
            }
     }
    

    System.out.println("Minimum number= "+min);//This wll print the minimum number
   }
   public static void main()
   {
    Min_max obj= new Min_max();
    obj.maxx(34,56,91,23,67,53,98,65,100);//caller
    obj.minn(34,56,91,23,67,53,98,65,100);//caller
   }
}


   