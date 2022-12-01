import javax.swing.*;
import java.text.*;

public class MakeChange2 {
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		String movieName = JOptionPane.showInputDialog("Enter the movie name");
		float priceAdultTicket = Float.parseFloat(JOptionPane.showInputDialog("Enter the price of an adult ticket"));
		float priceChildTicket = Float.parseFloat(JOptionPane.showInputDialog("Enter the price of a child ticket"));
		int numberAdultTicket = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of adult tickets sold"));
		int numberChildTicket = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of child tickets sold"));
		int donation = Integer.parseInt(JOptionPane.showInputDialog("Enter the percentage of the donation"));
		
		int ticketSold = numberAdultTicket + numberChildTicket;
		float grossAmount = (numberAdultTicket*priceAdultTicket) + (numberChildTicket*priceChildTicket);
		float grossAmountDonated = grossAmount*donation/100;
		float netPrice = grossAmount-grossAmountDonated;
		
		JOptionPane.showMessageDialog(null,
				"Movie Name: "+movieName
				+"\nNumber of tickets sold: "+ticketSold 
				+"\nGross Amount: $"+frm.format(grossAmount)
				+"\nPercentage of the Gross Amount Donated: "+frm.format(donation)+"%"
				+"\nAmount Donated: $"+frm.format(grossAmountDonated)
				+"\nNet Sale: $"+frm.format(netPrice)
				,"Theater Sales Data",JOptionPane.INFORMATION_MESSAGE);
		
	}

}
