import java.util.Scanner;

public class MovieDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input movie id   : ");
		String id = scan.nextLine();
		System.out.print("Input movie name : ");
		String name = scan.nextLine();
		System.out.println();
		System.out.print("Input director name : ");
		String directorName = scan.nextLine();
		System.out.print("Input director e-mail : ");
		String directorEmail = scan.nextLine();
		System.out.print("Input director gender : ");
		char directorGender = scan.next().charAt(0);
		while(!(directorGender+"").equalsIgnoreCase("m")&&!(directorGender+"").equalsIgnoreCase("f")) {
			System.out.print("Input director gender, again : ");
			directorGender = scan.next().charAt(0);
		}
		System.out.println();
		System.out.print("Input movie theater no. : ");
		int theaterNo = scan.nextInt();
		while(theaterNo<=0||theaterNo>15) {
			System.out.print("Please input 1 - 15 only : ");
			theaterNo = scan.nextInt();
			
		}
		Theater movie = new Theater(id,name,new Director(directorName,directorEmail,directorGender),theaterNo);
		System.out.println();
		System.out.println(movie);
	}

}
