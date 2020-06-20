import java.util.Scanner;
class Main{
  public static void q(int arr[],int n)
  {
    int arr1[]=new int[n];
    int k=0;
    for(int i=0;i<n;i++)
    {
      if(arr[i]!=0)
      {
        arr1[k]=arr[i];
        k++;
      }
    }
    for(int i=0;i<n;i++)
    {
      arr[i]=arr1[i];
    }
  }
    public static void main(String args[])
    {
		Scanner in=new Scanner (System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
        //System.out.println(arr[i]);
      }
      q(arr,n);
      for(int i=0;i<n;i++)
      {
        System.out.print(arr[i]);
        System.out.print(' ');
      }
    }
}