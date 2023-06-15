/**
 * 
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

/**
 * @author Matos
 *
 */
public class ShapeProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> listShapes = new ArrayList<>();
		
		System.out.println("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data: ");
			
			System.out.print("Rectangle or Circle (r/c)? ");
			char typeShape = sc.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			
			if(typeShape == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				listShapes.add(new Rectangle(color, width, height));
				
			} else if (typeShape == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				listShapes.add(new Circle(color, radius));
				
			}
			
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for(Shape s: listShapes) {
			System.out.println(String.format("%.2f", s.area()));
		}
		
		sc.close();

	}

}
