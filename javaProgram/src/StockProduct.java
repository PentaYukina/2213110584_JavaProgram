import java.text.DecimalFormat;
import java.util.*;

public class StockProduct {
	static Scanner scan = new Scanner(System.in);
	static Product[] pd = new Product[4];
	
	public static void main(String[] args) { 
		DecimalFormat frm = new DecimalFormat("#,###.00");
		for (int i = 0; i < pd.length; i++) {
			pd[i] = new Product();
			System.out.print("Input product Id : ");
			pd[i].setId(scan.next());
			System.out.print("Input product Unit : ");
			pd[i].setUnit(scan.nextInt());
			while(pd[i].getUnit()<=0) {
				System.out.print("Input product Unit, again : ");
				pd[i].setUnit(scan.nextInt());
			}
			System.out.print("Input product Price : ");
			pd[i].setPrice(scan.nextDouble());
			while(pd[i].getPrice()<=0) {
				System.out.print("Input product Price, again : ");
				pd[i].setPrice(scan.nextDouble());
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------");
		double total = 0;
		for (Product _pd : pd) {
			System.out.println("Product ID : " + _pd.getId() + ", Total price = " + frm.format(_pd.calculate())+" baht.");
			total += _pd.calculate();
		}
		System.out.println("-------------------------------------------");
		System.out.println("Total price of all products is "+frm.format(total)+" baht.");
	}

}
