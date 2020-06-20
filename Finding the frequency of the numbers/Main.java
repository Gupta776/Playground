import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	 Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int k= in.nextInt();
      int arr[]= new int[n];
      for(int i=0;i< n;i++)
      {
        arr[i]=in.nextInt();
         //System.out.print(arr[i]);
       // System.out.print(" ");
      }
       
      int arr1[]= new int[10];
      int j=0;
      for(int i=0;i< n;i++)
      {
         j=arr[i];
        arr1[j]=arr1[j]+1;
      }
     
      for(int i=1;i<= k;i++)
      {
        System.out.print(i);
        System.out.print(" ");
        System.out.println(arr1[i]);
      }
    }
}