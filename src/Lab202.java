import javax.swing.*;
import java.util.*;

public class Lab202 {
public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.print("Input the name of minutes : ");
	String productName = scan.nextLine();
		int timeParking =int hour = timeParking / 60;
		int minute = timeParking % 60;
		float price = (((float)hour*50)+((float)minute*25/100));
		
		JOptionPane.showMessageDialog(null,
				"You parking "+hour
				+" Hour "+minute +" Minute."
				+"\nAmount to be paid is "+price +" baht.");
		
	}

}
