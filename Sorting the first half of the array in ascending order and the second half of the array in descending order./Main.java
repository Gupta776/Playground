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
    int k1=n-k;
    int arr1[]=new int[k];
        int arr2[]=new int[k1];
    for(int i=0;i<k;i++)
    {
      arr1[i]=arr[i];
    }
    for(int i=0;i<k1;i++)
    {
      arr2[i]=arr[i+k];
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
     for(int i=0;i<k1;i++)
    {
      for(int j=0;j<k1-1;j++)
      {
        if( arr2[j+1]>arr2[j])
        {
          m=arr2[j];
          arr2[j]=arr2[j+1];
          arr2[j+1]=m;
        }
      }
    }
      for(int i=0;i<k;i++)
    {
      arr[i]=arr1[i];
        //System.out.print (arr1[i] + " ");
    }
       for(int i=0;i<k1;i++)
    {
      arr[i+k]=arr2[i];
//System.out.print (arr2[i] + " ");
    }
    for(int i=0;i<n;i++)
    {
System.out.print (arr[i] + " ");
       //System.out.print (" ");
    }
  }
}