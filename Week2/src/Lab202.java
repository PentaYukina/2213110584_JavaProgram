import java.util.*;

public class Lab202 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the number of minutes: ");
		int TimeMinutes = scan.nextInt();
		int Years = TimeMinutes/60/24/365;
		int Days = (TimeMinutes/60/24)-(Years*365);
		
		System.out.print(TimeMinutes+" minutes is approximately "+Years+" years and "
				+Days+" days");
		
	}

}
