/*package ooptest;

class Point3D extends Point {
	int z;
	
	Point3D(){
		this(1,1,1);
	}
	
	Point3D(int x, int y, int z){
		super(x, y); // Point(x,y);
		this.z = z;
	}
	
	public String toString(){
		return super.toString() + ", z=" + z;
	}
}

class Point {
	int x;
	int y;


	public boolean equals(Object obj) {
		if(obj==null && !(obj instanceof Point)) return false;
		
		Point p = (Point)obj;
		
//		if(this.x==p.x && this.y == p.y) 
//			return true;
//		else
//			return false;
//		
		return this.x==p.x && this.y == p.y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	Point(){
		this(1,1); // Point(1,1);
//		x = 1; // x는 인스턴스 변수
//		y = 1;
	}; // 기본생성자
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}; // 매개변수 있는 생성자
	
	double getDistance(Point p){ // 인스턴스 메서드 im -> iv사용 & 객체 생성후 사용가능
		return getDistance(this, p); // im->cm 호출
//		int a = this.x - p.x;
//		int b = this.y - p.y;
//		double result = Math.sqrt(a*a+b*b);
//		return result;
	}
	
	static double getDistance(Point p1, Point p2){ // 인스턴스 메서드 im -> iv사용 & 객체 생성후 사용가능
		int a = p1.x - p2.x;
		int b = p1.y - p2.y;
		double result = Math.sqrt(a*a+b*b);
		return result;
	}
	
}

public class PointTest {
	public static void main(String[] args) {
		Point p = new Point(3,5);
		Point p1 = new Point(0,0); // 기본생성자 이용
		Point p2 = new Point(2,2); // 매개변수생성자 이용
		System.out.println("p.x=" + p.x);
		System.out.println("p.y=" + p.y);
		System.out.println(p1.toString()); //기본생성자 호출
		System.out.println(p2.toString()); //매개변수생성자 호출
		System.out.println(p.getDistance(p1)); //
//		System.out.println(Math.sqrt(8));
		System.out.println(Point.getDistance(p1,p2)); //
//		System.out.println(p1.equals(p1,p2));
		
		Point3D p3d = new Point3D();
		Point3D p3d2 = new Point3D(1,2,3);
		System.out.println(p3d);
		System.out.println(p3d2);
		
	}
}
*/