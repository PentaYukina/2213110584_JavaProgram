import java.text.*;
import java.util.Scanner;

public class SalespersonSalary {
	static final double COMMISSION_RATE = 0.15;
	static final int SENTINEL = -1;
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int sales;
		double salary;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.print("Enter sales in dollars (or -1 to end): ");
			sales = scan.nextInt();
			if(sales == SENTINEL) 
				System.out.print("bye");
			else {
				salary = (sales*COMMISSION_RATE)+1000;
				System.out.println("Salary is: $"+frm.format(salary));}
				System.out.println();
		}while(sales != SENTINEL);	
	}	
}
