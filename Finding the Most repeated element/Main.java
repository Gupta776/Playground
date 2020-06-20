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
     int arr1[]= new int[10];
     int j=0;
     for(int i = 0; i < size; i++)
       {
       j=arr[i];
      arr1[j]=arr1[j]+1;
       }
     int max=0;
     int a=0;
     for(int i=0; i <10 ;i++)
     {
       if( arr1[j] > max )
       {
         max =arr1[j];
         a=j;
       } 
     }
     int p=0;
      for(int i=0; i <9 ;i++)
     {
       if( arr1[j] == arr1[i+1])
       {
         p=p+1;
       } 
     }
    // System.out.print(p);
     if( p+1 == size)
     {
       a=arr[0];
       //System.out.print(p);
     }
     System.out.print(a);
     
   }
   }