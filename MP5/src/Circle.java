
public class Circle implements Shape{
private int radius;
private double area;

public Circle(){
	radius = 1;
	area = calcArea();
}

public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}

@Override
public double calcArea() {
	return (Math.PI * Math.pow(radius, 2));	
}

@Override
public String toString() {
	return "The area of the Circle is " + area + "\nThe radius is of the Circle is " + radius + "\n";
}

}
