import java.util.*;

public class Lab607 {
	static Scanner scan = new Scanner(System.in);
	static String month[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September","October", "November", "December" };
	static int count[] = new int[12];
	static int birthDay[] = new int[5];
	public static void main(String[] args) {
		inputBirthDate();
	}
	public static void inputBirthDate() {
		
		for(int i=0;i<birthDay.length;i++) {
			System.out.print("Enter BirthDate "+(i+1)+" :");
			String bDay = scan.nextLine();
			int bmonth = checkBirthDate(bDay);
			birthDay[i] = bmonth;
			count[bmonth-1]++;
		}
		System.out.println();
		displayCountBday(count);
	}
	public static int checkBirthDate(String birthDay) {
		int birthDate = Integer.parseInt(birthDay.substring(3,5));
		return birthDate;
	}
	public static void displayCountBday(int[] count) {
		for(int i=0;i<count.length;i++) {
			System.out.println(month[i]+"   ["+count[i]+" people]");
		}
	}
}
