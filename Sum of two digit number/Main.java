import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int k=n/10;
      int j=n%10;
      int s=k+j;
      System.out.println(s);
	}
}