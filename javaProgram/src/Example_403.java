import java.util.*;
import javax.swing.*;

public class Example_403 {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		System.out.print("Input a sentence : ");
		String sentence = scan.nextLine();
		while(!sentence.endsWith(".")){
			System.out.print("Input a sentence, again : ");
			sentence = scan.nextLine();
		}
		System.out.println();
		int spaceofSentence = 0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				spaceofSentence++;
			}
		}
		System.out.println("This sentence has "+spaceofSentence+" spacebar.");
		System.out.println("This sentence has "+(spaceofSentence+1)+" word.");*/
		String sentence = JOptionPane.showInputDialog("Input a sentence : ");
		while(!sentence.endsWith(".")){
			JOptionPane.showInputDialog("Input a sentence, again : ");
		}
		int spaceofSentence = 0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				spaceofSentence++;
			}
		}
		JOptionPane.showMessageDialog(null,"This sentence has "+spaceofSentence+" spacebar."
						+"\nThis sentence has "+(spaceofSentence+1)+" word.");
	
	}

}
