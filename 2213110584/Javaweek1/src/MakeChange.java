import java.util.*;


public class MakeChange {
	static final int HALFDOLLAR = 50;
	static final int QUARTER = 25;
	static final int DIME = 10;
	static final int NICKEL = 5;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the change in cents : ");
		int cents = scan.nextInt();
		System.out.println();
		System.out.println("The change you entered is "+cents);
		
		int halfDollars = cents/HALFDOLLAR;
		cents = cents % HALFDOLLAR;
		int quarters = cents/QUARTER;
		cents = cents % QUARTER;
		int	dimes = cents/DIME;
		cents = cents % DIME;
		int	nickels = cents/NICKEL;
		cents = cents % NICKEL;
		
		System.out.println("The number of half dollars to be returned is "+halfDollars);
		System.out.println("The number of quarters to be returned is "+quarters);
		System.out.println("The number of dimes to be returned is "+dimes);
		System.out.println("The number of nickels to be returned is "+nickels);
		System.out.println("The number of pennies to be returned is "+cents);
	}

}
