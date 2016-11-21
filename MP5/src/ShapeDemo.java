import java.util.ArrayList;
import java.util.Arrays;

//Albert Cape
//COSC 211 - MP5
//11/16/16

public class ShapeDemo {
	ArrayList <ShapeDemo> shapes = new ArrayList(); 
	Shape Circle;
	Shape Rectangle;
	Shape Cube;
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		Cube cu1 = new Cube();
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		shapes.add(c1);
		shapes.add(c2);
		shapes.add(r1);
		shapes.add(r2);
		shapes.add(cu1);
		
		displayArea(c1);
		displayArea(c2);
		displayArea(r1);
		displayArea(r2);
		displayArea(cu1);
		
	}
	
public static void displayArea(Shape s)
{
	System.out.println(s);
}

}
