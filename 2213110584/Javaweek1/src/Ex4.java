import javax.swing.*;
import java.text.*;

public class Ex4 {
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		String productName = JOptionPane.showInputDialog("Input Product Name   : ");
		String productUnitstr = JOptionPane.showInputDialog("Input Product unit   : ");
		int productUnit = Integer.parseInt(productUnitstr);
		String productPrice = JOptionPane.showInputDialog("Input Price per unit   : ");
		float productPricePerUnit = Float.parseFloat(productUnitstr);
		
		float totalPrice = productPricePerUnit*productUnit;
		float priceVat = totalPrice+(totalPrice*7/100);
		JOptionPane.showMessageDialog(null,"Total Price is "+frm.format(totalPrice)
												+"\nADD VAT 7%  is "+frm.format(priceVat));
		
	}

}
