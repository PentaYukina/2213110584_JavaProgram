import java.util.*;

public class TestStudent {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("How many student in classroom: ");
		int size = scan.nextInt();
		Student[] std = new Student[size];
		System.out.println();
		
		for (int i = 0; i < std.length; i++) {
			System.out.println("INPUT INFORMATION OF STUDENT "+(i+1));
			System.out.println("---------------------------------------");
			std[i] = new Student();
			System.out.print("Input student name  : ");
			std[i].setName(scan.next());
			System.out.print("Input student score : ");
			std[i].setScore(scan.nextInt());
			while (!std[i].checkScore()) {
				System.out.print("Input student score, again : ");
				std[i].setScore(scan.nextInt());
			}
			System.out.println();
		}
		System.out.println("LIST OF PASS STUDENT (>=50)");
		System.out.println("----------------------------");
		/*
		 * for(int i=0;i<std.length;i++) { if(std[i].isPass()) {
		 * System.out.println(">> "+std[i].getName()+" ("+std[i].getScore()+" )"); } }
		 */
		for (Student _std : std) {
			if (_std.isPass()) {
				System.out.println(">> " + _std.getName() + " (" + _std.getScore() + ")");
			}

		}
	}

}
