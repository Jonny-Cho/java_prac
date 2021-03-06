/*package oopTest;

class Point3D extends Point {
	int z;

	Point3D() {
		// this.x = 1;
		// this.y = 1;
		// this.z = 1;
		this(1, 1, 1); // Point3D(1,1,1);
	}

	Point3D(int x, int y, int z) {
		// this.x = x;
		// this.y = y;
		super(x, y); // Point(x, y);
		this.z = z;
	}

	public String toString() {
		// return "x="+x + ", y="+y+", z="+z;
		return super.toString() + ", z=" + z;
	}
}

class Point {
	int x; // this.x
	int y; // this.y

	Point() {
		this(1, 1); // Point(1,1);
		// this.x = 1;
		// this.y = 1;
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x=" + x + ", y=" + y;
	}

	public boolean equals(Object obj) {
		// if(obj==null && !(obj instanceof Point)) return false;
		if (!(obj instanceof Point))
			return false;

		Point p = (Point) obj;

		// if(this.x==p.x && this.y==p.y)
		// return true;
		// else
		// return false;

		return this.x == p.x && this.y == p.y;
	}

	double getDistance(Point p) {
		// int a = this.x - p.x;
		// int b = this.y - p.y;
		//
		// return Math.sqrt(a*a + b*b);
		return getDistance(this, p);
	}

	static double getDistance(Point p1, Point p2) {
		int a = p1.x - p2.x;
		int b = p1.y - p2.y;

		return Math.sqrt(a * a + b * b);
	}
}

public class PointTest {
	public static void main(String[] args) {
		Point p = new Point(3, 5);
		Point p2 = new Point(2, 2);
		Point p3 = new Point(2, 2);
		System.out.println(p2.equals(p3));
		System.out.println(p2.getDistance(p3));
		System.out.println(Point.getDistance(p2, p3));

		Point3D p3d = new Point3D();
		Point3D p3d2 = new Point3D(1, 2, 3);
		System.out.println(p3d);
		System.out.println(p3d2);
	}

}*/