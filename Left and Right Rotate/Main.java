import java.util.Scanner;
class Main 
{
  public static void ss(int arr[],int n,int r)
  {
          int o[]=new int[n];
          int e[]=new int[n];
    int k1=0,k2=0;
     for(int i=0;i<n;i++)
      {
        if(i%2==0)
        {
          e[k1]=arr[i];
          k1++;
        }
       else
       {
         o[k2]=arr[i];
          k2++;
       }
      }
    int temp1=0;
    int temp2=0;
    for(int j=0;j<r;j++)
    {
    //for(int i=0;i<k1-1;i++)
      for(int i=k1-1;i>0;i--)
    {
      temp1=e[i];
      e[i]=e[i-1];
      e[i-1]=temp1;
    }
     // System.out.println(k2);
      for(int i=0;i<k2-1;i++)
    {
      temp2=o[i];
      o[i]=o[i+1];
      o[i+1]=temp2;
    }
      
    }
    
     k1=0;
    k2=0;
    for(int i=0;i<n;i++)
      {
        if(i%2==0)
        {
          arr[i]=e[k1];
          k1++;
        }
       else
       {
        arr[i]= o[k2];
           k2++;
       }
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
      }
    int r=in.nextInt();
    //System.out.print(r);
    ss(arr,n,r);
    for(int i=0;i<n;i++)
      {
      System.out.print(arr[i]);
      System.out.print(' ');
        //arr[i]=in.nextInt();
      }
  	}
}