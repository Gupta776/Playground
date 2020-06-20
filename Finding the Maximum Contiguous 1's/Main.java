import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
       Scanner in = new Scanner(System.in);
       
	   int size = in.nextInt();
       int arr[] = new int[size];
       for(int i = 0; i < size; i++)
       {
           arr[i] = in.nextInt();
       }
     int m=0;
     int s=0;
     for(int i = 0; i < size; i++)
       {
           if(arr[i] == 1 )
           {
             s=s+1;
             
           }
       else
       {
         s=0;
       }
       if( m < s)
       {
         m=s;
       }
       
       }
     System.out.print(m);
     
   }
}