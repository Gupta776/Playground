import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int arr[]= new int[n];
      for(int i=0;i< n;i++)
      {
        arr[i]=in.nextInt();
//System.out.print(arr[i]);
//System.out.print(" ");
      }
      int k= in.nextInt();
       //System.out.println();
      int arr1[]= new int[n];
      int m=0;
      for(int i=0;i< n;i++)
      {
        for(int j=0;j<n-1;j++)
         {
        	if( arr[j] < arr[j+1])
           {
              int t=arr[j];
              arr[j]=arr[j+1];
             arr[j+1] =t;
            }
         
         }
      }
       for(int i=0;i< n;i++)
      {
       // System.out.print(arr[i]);
        //  System.out.print(" ");
      }
      System.out.print(arr[k-1]);
    }
}