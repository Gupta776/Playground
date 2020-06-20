
import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //write your logic here
    	Scanner in = new Scanner(System.in);
    	String name = in.nextLine();
    	int n = in.nextInt();
    	Details obj = new Details(name,n);
      switch (n)
      {
        case 1:
    		obj.notificationBySms();
          	break;
        case 2:
          obj.notificationByEmail();
          	break;
        case 3:
          obj.notificationByCourier();
          	break;
    }
}
}
     interface Notification {
    	public void notificationByEmail();
    	public void notificationByCourier();
    	public void notificationBySms();
    	
    }
    
     class Details implements Notification {
    	 String name;
    	 int n;
    	 
    	public Details(String name, int n) {
			super();
			this.name = name;
			this.n = n;
        }
		public void notificationByEmail() {
    	System.out.println(name +"-Notification by Mail");
    	}
    	public void notificationByCourier() {
    		System.out.println(name +"-Notification by Courier");
    	}
    	public void notificationBySms() {
    		System.out.println(name +"-Notification by SMS");
    	}
     }


