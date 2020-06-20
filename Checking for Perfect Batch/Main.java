import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++)
    {
     arr[i] = in.nextInt();
   }
    int c=0,d=0,k=1;
    for(int i = 0; i < 3; i++)
    {
     d=arr[i]+d;
   }
    //System.out.println(d);
    for(int i = 1; i < n/3; i++)
    {
        c=arr[3*i]+arr[3*i+1]+arr[3*i+2];
     // System.out.println(c);
      if(d!=c)
      {
        System.out.print("Not a Perfect Batch");
        k=0;
		break;
      }
        c=0;
   }
    if(d==d && k==1)
    {
     System.out.print("Perfect Batch");
    }
    else
    {
      //System.out.print("Not a Perfect Batch");
    }
  }
}