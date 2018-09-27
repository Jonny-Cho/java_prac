package ooptest;

class Point3D extends Point {
	int z;
	Point3D(){
		this(1, 1, 1);
	}
	
	Point3D(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
	
	public String toString(){
		return super.toString()+", z = "+z;
	}
}

class Point {
	int x;
	int y;
	Point(){
		this(0,0);
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString(){
		return "x = "+x+", y = "+y;
	}
	
	double getDistance(Point p){
		return getDistance(this, p);
//		int a = this.x - p.x;
//		int b = this.y - p.y;
//		return Math.sqrt(a*a+b*b);
	}
	
	static double getDistance(Point p1, Point p2){
		int a = p1.x - p2.x;
		int b = p1.y - p2.y;
		return Math.sqrt(a*a+b*b);
	}
	
	public boolean equals(Object obj){
		if(!(obj instanceof Point))
			return false;
		
		Point p = (Point)obj;
		
		return this.x == p.x && this.y == p.y;
	}
}

public class PointTest1_10 {
	public static void main(String[] args){
		Point p = new Point();
		Point p1 = new Point(1, 1);
		Point p2 = new Point(1, 2);
		System.out.println(p);
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println(p.getDistance(p1));
		System.out.println(Point.getDistance(p1, p2));
		
		System.out.println(p.equals(p1));
		
		Point3D p3d = new Point3D();
		Point3D p3d2 = new Point3D(2, 2, 2);
		System.out.println(p3d);
		System.out.println(p3d2);
	}
}