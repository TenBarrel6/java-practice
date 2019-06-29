package day60_polymorphism02;

import day59_polymorphism.*; 

public class InstanceOfOperator {
	public static void main(String[] args) {
		Shape shape = new Circle();
		System.out.println(shape.getClass().getName());
		System.out.println(shape.getClass().getSimpleName());
		
		
		System.out.println(shape.getClass().getSimpleName().equals("Triangle")?"its triangle"
				:shape.getClass().getSimpleName().equals("Circle")?"its circle":"its square");
//				:shape.getClass().getSimpleName().equals("Square"));
		
		System.out.println(shape instanceof Shape);
		System.out.println(shape instanceof Circle);
		System.out.println(shape instanceof Triangle);
		System.out.println(shape instanceof Object);
		
		System.out.println(shape instanceof Triangle?"its triangle"
				:shape instanceof Circle?"its circle":"its square");
		
		Shape[] shapes = {new Triangle(), new Square(), new Circle(), new Triangle(), new Square()};
		
		int circles = 0, squares = 0, triangles = 0;
		
//		for(Shape sh:shapes) {
//			sh instanceof Triangle?triangles++:squares++;
////					:sh instanceof Circle?circles++:squares++;
//						
//		}
	}
}
