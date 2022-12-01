import javax.swing.*;

public class Lab104 {
	public static void main(String[] args) {
		
		int timeParking =Integer.parseInt(JOptionPane.showInputDialog("Input Time Parking(minute): "));
		int hour = timeParking / 60;
		int minute = timeParking % 60;
		float price = (((float)hour*50)+((float)minute*25/100));
		
		JOptionPane.showMessageDialog(null,
				"You parking "+hour
				+" Hour "+minute +" Minute."
				+"\nAmount to be paid is "+price +" baht.");
		
	}

}
