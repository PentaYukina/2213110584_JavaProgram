import java.io.*;
import java.util.*;

public class ATMBanking {
	public static void main(String[] args) throws IOException {
		Scanner console = new Scanner(System.in);
		String acc,pass;
		int money = 0;
		System.out.print("Enter account number : ");
		acc = console.nextLine();
		System.out.print("Enter password : ");
		pass = console.next();
		while(pass.length()!=4) {
			System.out.print("Enter password : ");
			pass = console.next();
		}
		System.out.print("Enter money : ");
		money = console.nextInt();
		while(money<=0) {
			System.out.print("Enter money : ");
			money = console.nextInt();
		}
		ATMChecking bank = new ATMChecking(acc,pass,money);
	}
}
