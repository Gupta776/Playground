import java.util.Scanner;
class Main
{ 
	public static void main(String args[]) 
	{	   
		Scanner in = new Scanner(System.in); 
		String inp1 = in.nextLine(); 
		//String inp2 = in.nextLine();
    	StringBuilder sb1 = new StringBuilder(inp1);
    	//StringBuilder sb2 = new StringBuilder(inp2);
		StringBuilder result = new StringBuilder("");
		int carry = 0;
		int Num1Len = sb1.length()-1;
		//int Num2Len = sb2.length()-1;
		int sum = 0, rem = 0, idx1 = 0, idx2 = 0;
		sb1.reverse();
    	//sb2.reverse();
		while((idx1 <= Num1Len) )//&& (idx2 <= Num2Len))
		{
		    sum =(sb1.charAt(idx1) - '0') ;//+ (sb2.charAt(idx2)- '0')+ carry;
		    carry = sum / 10;
		    rem = sum % 10;
		    char num = (char)(rem + '0');
		    result = result.append(num);
		    idx1++;
//idx2++;
		}
		while(idx1 <= Num1Len)
		{
        	sum =(sb1.charAt(idx1) -'0') + carry;
    		carry = sum / 10;
    		rem = sum % 10;
  		    char num = (char)(rem + '0');
		    result = result.append(num);
            idx1++;
        }
        
		if(carry != 0)
        	{
                char num = (char)(carry + '0');
                result = result.append(num);
        	}
		result.reverse();
		System.out.println(result);
	} 
} 	