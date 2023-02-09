import java.util.Scanner;

public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input title : ");
		String title = scan.nextLine();
		System.out.print("Input publicyear : ");
		int publicyear = scan.nextInt();
		System.out.print("Input author name : ");
		String author_name = scan.next();
		scan.nextLine();
		System.out.print("Input author e-mail : ");
		String email = scan.nextLine();
		
		FictionBook fic = new FictionBook(title, publicyear);
		fic.setAuthorName(author_name);
		fic.setEmail(email);
		
		while(fic.checkFormatName()) {
			System.out.print("Input author name,again : ");
			author_name = scan.nextLine();
		}
		while(fic.checkEmail()) {
			System.out.print("Input author e-mail,again : ");
			email = scan.nextLine();
		}
		System.out.println(fic.toString());
	}

}
