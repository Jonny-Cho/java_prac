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
//	double getDistance(Point p){ // p�� p1��
//		int a = (x - p.x);
//		int b = (y - p.y);
//		double result = Math.sqrt(a*a+b*b);
//		return result;
//	}
//}

public class PointTest1_5 {

	public static void main(String[] args){
		Point p = new Point();
			p.x = 1;
			p.y = 1;
		Point p2 = new Point(2,2);
		
		System.out.println(p.x);
		System.out.println(p.y);
		
		System.out.println(p.toString());
		System.out.println(p2.toString());
		
		System.out.println(p.getDistance(p2));
	}
	
}
