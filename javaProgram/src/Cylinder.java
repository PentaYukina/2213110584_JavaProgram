
public class Cylinder extends Circle{
	private double height;
	
	public Cylinder(double radius,double height) {
		super(radius,null);
		this.height = height;
	}
	
	public double getHeigth() {
		return this.height;
	}
	
	public double getVolume() {
		return super.getArea()*getHeigth();
	}
	
	@Override
	public double getArea() {
		return (2*Math.PI *super.getRadius()*getHeigth()) + (2*super.getArea());
	}
	
	@Override
	public String toString() {
		return "height = " + getHeigth()+","+super.toString();
	}
}
