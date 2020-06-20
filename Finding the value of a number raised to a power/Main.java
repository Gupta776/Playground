import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int e = in.nextInt();
      int v =1;
      for(int i =0 ;i < e;i++)
      {
        v=v*base;
      }
      System.out.println(v);
      
    }
}