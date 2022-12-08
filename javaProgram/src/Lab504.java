import java.util.*;

public class Lab504 {

	
	public static void main(String[] args) {
		String fullname;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space.\n: ");
		fullname = scan.nextLine();
		int space = fullname.indexOf(' ');
		String firstName = fullname.substring(0,space);
		
		System.out.print(abbreviatName(fullname.toUpperCase()) + firstName);
	}
	
	public static String abbreviatName(String fullname) {
		String firstLetter = "";
		for(int i=0;i<fullname.length();i++) {
			if(fullname.charAt(i)==' ') {
				firstLetter = firstLetter + fullname.charAt(i+1);
				firstLetter = firstLetter + ".";
			}
		}return firstLetter ;
	}

}
