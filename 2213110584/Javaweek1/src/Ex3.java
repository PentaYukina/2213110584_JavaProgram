import java.util.*;
import java.text.*;

public class Ex3 {
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		System.out.print("Input product name   : ");
		String productName = scan.nextLine();
		System.out.print("Input product unit   : ");
		int productUnit = scan.nextInt();
		System.out.print("Input price per unit : ");
		float pricePerUnit = scan.nextFloat();
		
		System.out.println();
		float totalPrice = pricePerUnit*productUnit;
		System.out.println("Total Price is "+frm.format(totalPrice));
		float priceVat = totalPrice+(totalPrice*7/100);
		System.out.println("ADD VAT 7%  is "+frm.format(priceVat));
	}

}
