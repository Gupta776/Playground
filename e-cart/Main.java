//import required packages here
import java.util.Scanner;

class Item
{
private int price;
//create various method to return attribute value(s)

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

}
 
class Customer
{
private String product;
private int quantity;
//create various method to return attribute value(s)
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}

}

class Bill
{
//implement your logic to calculate total price
	
	public void totalBill(int cost,int q) {
		System.out.println("Total Price is : "+cost*q );
		
	}
}
class Main
{
public static void main(String[] args)
{
	Scanner in = new Scanner(System.in);
  Item i = new Item();
  Customer c = new Customer();
  Bill obj = new Bill();
  //write the logic here
  int cost;
  String name;
  int q;
  name = in.nextLine();
  cost = in.nextInt();
  q = in.nextInt();
  i.setPrice(cost);
  c.setProduct(name);
  c.setQuantity(q);
  obj.totalBill(cost, q);
  in.close();
}
}