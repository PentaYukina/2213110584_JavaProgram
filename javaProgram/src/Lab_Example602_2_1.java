import javax.swing.*;

public class Lab_Example602_2_1 {

	public static void main(String[] args) {
		String[] deptName = {"Accounting","HR","Sales","Innovation"};
		boolean deptWasFound = false;
		String departmentName = JOptionPane.showInputDialog("Enter a department name");
		
		for (int i=0;i<deptName.length;i++) {
			if(departmentName.equalsIgnoreCase(deptName[i])) {
				deptWasFound = true;
			}
		}
		
		if(deptWasFound) {
			JOptionPane.showMessageDialog(null, departmentName +" was found in the list");
		} else {
			JOptionPane.showMessageDialog(null, departmentName +" was not found in the list");
		}
	}

}
