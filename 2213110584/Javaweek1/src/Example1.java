
public class Example1 {

	public static void main(String[] args) {
		String isbn="iB2-6325-85-4-1";
		String title = "Basic Java Programming";
		int unit = 5;
		float price = 225.75f;
		System.out.println("Book ISBN  : "+isbn);
		System.out.println("Book Title : "+title);
		System.out.println("Book Unit  : "+unit);
		System.out.println("Book Price : "+price);
		float totalprice = price*unit;
		System.out.println("Toal Price is "+totalprice);
		float pricevat = totalprice+(totalprice*7/100);
		System.out.println("ADD VAT 7% is "+pricevat);
	}
}
