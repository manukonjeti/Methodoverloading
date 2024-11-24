package mypackage;

public class findAreaOfShapes {
	static int Area (int length, int breadth) {
	int	c=length*breadth;
	return c;
		
	}
	static double Area(double radius) {
	return Math.PI*radius*radius;
	
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int  a = Area(25,20);
		double b = Area(40);
		System.out.println("Area of rectangle" + a);
		System.out.println(b);
		

	}

}
