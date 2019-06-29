package day60_polymorphism02;

import day59_polymorphism.*;

import java.util.*;

public class ShapesArray {
	public static void main(String[] args) {
		Shape shape = new Triangle();
		shape.draw();

		Shape[] shapes = { new Triangle(), new Square(), new Circle(), new Triangle(), new Square(), new Circle() };
		Shape[] shapes2 = new Shape[3];
		shapes2[0] = new Triangle();
		shapes2[1] = new Square();
		shapes2[2] = new Circle();

		shapes[0].draw();
		shapes2[2].draw();

		System.out.println("#### FOR EACH LOOP ####");

		for (Shape myShape : shapes) {
			System.out.println(myShape.getClass().getSimpleName());
			myShape.draw();
		}
		
		List<Shape> shapesList = new ArrayList<>(); 
		
		shapesList.add(new Triangle());
		shapesList.add(new Square());
		shapesList.add(new Circle());
		shapesList.add(new Square());
		shapesList.add(new Square());
		System.out.println("For each from list");
		for(Shape i:shapesList) {
			System.out.println(i.getClass().getSimpleName().toUpperCase());
			i.draw();
		}
		
		System.out.println("For loop with list of shapes");
		for(int i = 0; i<shapesList.size(); i++) {
			shapesList.get(i).draw();
		}

	}
}
