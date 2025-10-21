import java.util.Scanner;

class ShapeAreaCalculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the shape name: 1.Circle, 2.Square, 3.Rectangle, 4.Triangle");
		String shape = sc.nextLine().toLowerCase();
		
		switch(shape){
			case "circle":
				System.out.println("Enter a number for radius");
				double radius = sc.nextDouble();
				double circle = 3.14159 * radius * radius;
				System.out.println("Area of circle: "+circle);
				break;
			
			case "square":
				System.out.println("Enter a number for side length");
				int sidelength = sc.nextInt();
				int square = sidelength * sidelength;
				System.out.println("Area of Square: "+square);
				break;
			
			case "rectangle":
				System.out.println("Enter a number for length");
				int length = sc.nextInt();
				System.out.println("Enter a number for width");
				int width = sc.nextInt();
				int rectangle = length * width;
				System.out.println("Area of rectangle: "+rectangle);
				break;
			
			case "triangle":
				System.out.println("Enter a number for base");
				double base = sc.nextDouble();
				System.out.println("Enter a number for height");
				double height = sc.nextDouble();
				double triangle = 0.5 * base * height;
				System.out.println("Area of triangle: "+triangle);
				break;
		}
	}
}