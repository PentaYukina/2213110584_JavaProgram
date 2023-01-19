
public class TestTime {

	public static void main(String[] args) {
		//constructor with parameter
		Time t1 = new Time(1,2,3);
		System.out.println(t1);
		
		//default constructor
		Time t2 = new Time();
		System.out.println(t2);
		
		//setter and getter
		t1.setHour(4);
		t1.setMinute(5);
		t1.setSecond(6);
		System.out.println("\n"+t1);
		System.out.println("Hour is: "+t1.getHour());
		System.out.println("Minute is: "+t1.getMinute());
		System.out.println("Second is: "+t1.getSecond());
		
		//setTime()
		t1.setTime(58, 59, 23);
		System.out.println("\n"+t1);
		
		//nextSecond() and chaining
		System.out.println(t1.nextSecond());
		System.out.println(t1.nextSecond().nextSecond().nextSecond());
	}

}
