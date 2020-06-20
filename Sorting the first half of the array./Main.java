import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in= new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
    int k=n/2;
    int arr1[]=new int[k];
    for(int i=0;i<k;i++)
    {
      arr1[i]=arr[i];
    }
    int m=0;
     for(int i=0;i<k;i++)
    {
      for(int j=0;j<k-1;j++)
      {
        if( arr1[j+1]<arr1[j])
        {
          m=arr1[j+1];
          arr1[j+1]=arr1[j];
          arr1[j]=m;
        }
        
      }
       
    }
      for(int i=0;i<k;i++)
    {
      arr[i]=arr1[i];
        //System.out.print (arr1[i] + " ");
    }
    for(int i=0;i<n;i++)
    {
     System.out.print (arr[i] + " ");
       //System.out.print (" ");
    }
  }
}