
public class TestStudent {

	public static void main(String[] args) {
		Student jirapat = new Student("Jirapat Anantasiri","1 Happy ave");
		System.out.println(jirapat);
		
		jirapat.setAddress("25 pattanakarn");
		System.out.println(jirapat);
		System.out.println(jirapat.getName());
		System.out.println(jirapat.getAddress());
	
		jirapat.addCourseGrade("INT107", 25);
		jirapat.addCourseGrade("INT108", 79);
		jirapat.addCourseGrade("MSC202", 69);
		jirapat.printGrades();
		
		System.out.printf("The average grade is %.2f%n",jirapat.getAverageGrade());
	}

}
