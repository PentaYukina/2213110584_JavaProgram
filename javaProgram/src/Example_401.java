import java.util.*;

public class Example_401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputWord ="" ;
		String txtWord ="";
		while(true) {
			System.out.print("Enter Word : ");
			inputWord = scan.next();
			if(inputWord.equalsIgnoreCase("Stop")){
				break;
			}
			
			txtWord = txtWord+inputWord+" ";
		}
		System.out.println(txtWord.toUpperCase());

	}

}
