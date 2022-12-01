import java.util.*;

public class Lab403 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String message = scan.nextLine();
		String check = message.toLowerCase();
		int word = 0;
		for(int i=0;i<message.length();i++) {
			if(check.indexOf("nichi")>=0) {
				word++;
			}
		}
		if(word==0)
			System.out.println(message);
		else {
			System.out.println("Nichi is a sentence");
		}
	}
}
