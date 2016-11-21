
public class Rectangle implements Shape{
int height = 1;
int width = 1;
double area = calcArea();

public double getArea() {
	return area;
}
public void setArea(int area) {
	this.area = area;
}
public double getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public double getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}

@Override
public double calcArea() {
	return area = width * height;
	
	
}
@Override
public String toString() {
	return "The area of the Rectangle is " + area + " \nThe height of the Rectangle is " + height + 
			"\nThe width of the Rectangle is " + width + "\n";
	
}
}
