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
//}

public class PointTest1_4 {

	public static void main(String[] args){
		Point p = new Point();
			p.x = 3;
			p.y = 5;
		Point p2 = new Point(2,3);
		
		System.out.println(p.x);
		System.out.println(p.y);
		
		System.out.println(p.toString());
		System.out.println(p2.toString());
	}
	
}
