import javax.swing.*;
public class Shop100Baht {
	public static void main(String[] args) {
		Product arnupab = new Product();
		int botton = JOptionPane.showConfirmDialog(null, "Is the program run on Pattanakarn Branch?","Run Program",JOptionPane.YES_NO_OPTION);
		
		if(botton == 0) {
			arnupab = new PattanakarnBranch();
		}
		arnupab.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product:")));
		JOptionPane.showMessageDialog(null, arnupab);
	}
}
