import javax.swing.*;
import java.text.*;

public class Ex2 {
	
	static final float BUFFETPRICE = 299;
	public static void main(String[] args) {
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int numberofCustomer = 5;
		float totalprice = BUFFETPRICE*numberofCustomer;
		System.out.println("Buffet of "+ numberofCustomer
				+" customers is "+frm.format(totalprice));
		float serviceCharge = totalprice+(totalprice*3/100);
		System.out.println("ADD Service Charge 3% is "+frm.format(serviceCharge));
		JOptionPane.showInputDialog(null,
				"Buffet of "+numberofCustomer
				+" customers is "+frm.format(totalprice)
				+"\nADD Service Charge 3% is "+frm.format(serviceCharge));
	}

}
