import java.util.*;

public class ShapeDemo1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input radius : ");
		double radius = scan.nextDouble();
		System.out.print("Input height : ");
		double height = scan.nextDouble();
		
		Circle circle = new Circle(radius, null );
		System.out.println("\nCircle[radius = "+circle.getRadius()+"] \nCircle[area = "+circle.getArea()+"]");

		Cylinder cylinder = new Cylinder(radius, height);
		System.out.println("\nCylinder[height = "+cylinder.getHeigth()+", radius = "+cylinder.getRadius()
				+"] \nCylinder[area = "+cylinder.getArea()+"]"
				+"\nCylinder[volume = "+cylinder.getVolume()+"]");
	}

}
