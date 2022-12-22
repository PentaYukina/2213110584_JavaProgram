import java.util.*;

public class StudentScore {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("How many student in classroom: ");
		int size = scan.nextInt();
		Student[] std = new Student[size];
		System.out.println();
		
		for (int i = 0; i < std.length; i++) {
			std[i] = new Student();
			System.out.print("Input student name  : ");
			std[i].setName(scan.next());
			System.out.print("Input student score : ");
			std[i].setScore(scan.nextInt());
			while (!std[i].checkScore()) {
				System.out.print("Input student score, again : ");
				std[i].setScore(scan.nextInt());
			}
			System.out.println("----------------------------");
		}
		for (Student _std : std) {
			if (_std.isPass()) {
			System.out.println(">> " + _std.getName() + " get grade " + _std.findGrade(_std.getScore()));
			}
		}
	}
}
