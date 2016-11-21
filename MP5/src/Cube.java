
public class Cube extends Rectangle implements Shape{
int length = 1;
double area = calcArea();

public double getLength() {
	return length;
}

public void setLength(int length) {
	this.length = length;
}

@Override
public double calcArea() {
	return area = length * width * height;
}

@Override
public String toString() {
	return "The area of the Cube is " + area + " \nThe length of the Cube is " + length + "\nThe width of the Cube is " 
			+ width + "\nThe height of the Cube is " + height + "\n";
}

}


