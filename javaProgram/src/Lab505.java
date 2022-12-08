import java.util.*;

public class Lab505 {

	static String studentID;
	static String subjectID;
	public static void main(String[] args) {
		inputStudent();

	}
	public static void inputStudent() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Student Id: ");
		 studentID = scan.next();
		System.out.print("Enter Subject Id: ");
		 subjectID = scan.next();
		while(!isLength(studentID,subjectID)) {
			System.out.print("Enter Student Id: ");
			studentID = scan.next();
			System.out.print("Enter Subject Id: ");
			subjectID = scan.next();
		}
		displayData(isITStudent(studentID),isITSubject(subjectID));
	}
	public static boolean isLength(String studentId,String subjectId) {
		if(studentId.length()==10 && subjectId.length()==7) 
			return true;
		 else return false ;
	}
	public static boolean isITStudent(String studentId) {
		if(studentId.substring(0, 6).equals("211311")) 
			return true;
		else return false ;
	}
	public static boolean isITSubject(String subjectId) {
		if(subjectId.substring(0, 2).equals("21")&& subjectId.substring(4, 5).equals("1")) 
			return true;
		else return false ;
	}
	public static void displayData(boolean studentId,boolean subjectId) {
		System.out.print("Student id: "+studentID+((studentId)? "":" is not")+" 1st year student in IT and\n"
					+((subjectId)? " Enroll":" not enroll")+" in courses for Year 1") ;
				
	}
}
