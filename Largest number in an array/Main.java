import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[] = new int[n];
      for(int i = 0;i < n;i++)
      {
        a[i] = in.nextInt();
      }
      int is_largest = 0;
      for(int i = 0;i < n;i++)
      {
        if(a[i] > is_largest)
        {
          is_largest = a[i];
        }
        else
        {
          is_largest = is_largest;
        }
      }
      System.out.println(is_largest);
    }
}