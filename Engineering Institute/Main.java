

import java.util.Scanner;
class Faculty
{
	public static int salary;
public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
public void salary()
{
  //write your Faculty class statements
	System.out.println("Base Salary: "+salary);
}
}
class CSE extends Faculty
{
	 
public void salary()
{
  //write your CSE class statements
	//salary = salary +3000;
  System.out.println("CSE Faculty: "+(salary+3000));
}
}
class IT extends Faculty
{
	//int salary;
public void salary()
{
  //write your IT class statements
  System.out.println("IT Faculty: "+(salary+5000));
}
}
class ECE extends Faculty
{
public void salary()
{
  //write your ECE class statements
  System.out.println("ECE Faculty: "+(salary+4500));
}
}

class Main
{
public static void main(String[] args)
{
  ECE obj = new ECE();
  Scanner in = new Scanner(System.in);
  int s = in.nextInt();
  Faculty f = new Faculty();
  CSE c = new CSE();
  IT i = new IT();
  f.setSalary(s);
  f.salary();
  c.salary();
  i.salary();
  obj.salary();
  in.close();
}
}