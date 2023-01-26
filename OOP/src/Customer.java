
public class Customer {
	private int id;
	private String name;
	private int discount;
	
	public Customer(int id,String name,int discount) {
		
	}
	public int getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String toString() {
		return getName()+"("+getID()+")"+"("+getDiscount()+"%)";
	}
}
