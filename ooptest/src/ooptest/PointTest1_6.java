package ooptest;

//class Point {
//	int x;
//	int y;
//	
//	public String toString() {
//		return "Point [x=" + x + ", y=" + y + "]";
//	}
//	
//	Point(){
//		this(1,1);
////		x = 1;
////		y = 2;
//	}
//	Point(int x, int y){
//		this.x = x;
//		this.y = y;
//	}
//	
//	double getDistance(Point p){ // p와 p1비교
//		int a = (x - p.x);
//		int b = (y - p.y);
//		double result = Math.sqrt(a*a+b*b);
//		return result;
//	}
//	
//	static double getDistance(Point p1, Point p2){ //p1과 p2비교
//		int a = (p1.x - p2.x);
//		int b = (p1.y - p2.y);
//		double result = Math.sqrt(a*a+b*b);
//		return result;
//	}
//}

public class PointTest1_6 {

	public static void main(String[] args){
		Point p = new Point();
			p.x = 1;
			p.y = 1;
		Point p1 = new Point(1,1);
		Point p2 = new Point(2,2);
		
		System.out.println(p.x);
		System.out.println(p.y);
		
		System.out.println(p.toString());
		System.out.println(p2.toString());
		
		System.out.println(p.getDistance(p2));
		System.out.println(Point.getDistance(p1, p2));
	}
	
}
