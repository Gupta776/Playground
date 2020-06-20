import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();
      int str_len = str.length();
      int front = 0;
      int end = str_len - 1;
      boolean is_palindrom = true;
      while(front < end)
      {
        if(str.charAt(front) != str.charAt(end))
        {
          is_palindrom = false;
          break;
        }
        front++;
        end--;
      }
      if(is_palindrom == true)
        System.out.println("Yes");
      else
        System.out.println("No");
    } 
}