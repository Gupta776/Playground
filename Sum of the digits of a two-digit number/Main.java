import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int first = num/10;
      int second = num%10;
      int sum = first + second;
      System.out.println(sum);
	}
}