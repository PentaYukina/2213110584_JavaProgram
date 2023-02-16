import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class ATMChecking extends ATMData {
	private int money;
	static DecimalFormat frm = new DecimalFormat("#,###.00");
	public ATMChecking(String account,String password,int money) {
		super(account,password);
		this.money = money;
	}
	
	public boolean checkBookBank() throws IOException{
		try {
			Scanner read = new Scanner(new File("ATMBookBank.txt"));
			/*String temp = "";
			while((temp = read.readLine()) != null) {
				String[] data = temp.split("\t");
				int money = Integer.parseInt(data[2]);
				if((data[0])==super.getID()) {
				
				}
			
			}*/
		}
		catch(IOException e){
			System.out.print("\nSorry, your id or password is wrong, or your amount not enough.");
		}
		return true;
	}
	
	public void show() {
		System.out.println("You drawing for "+frm.format(money)+", get"
					+"\n\t1000 = "+frm.format(money/1000)+"\n\t500 = "+frm.format(money/500)
					+"\n\t100 = "+frm.format(money/100)
					+"Your balance is "+" Baht.");
		
	}
}
