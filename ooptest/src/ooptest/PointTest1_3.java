package ooptest;

//class Point {
//	int x;
//	int y;
//	
//	public String toString() {
//		return "Point [x=" + x + ", y=" + y + "]";
//	}
//}

public class PointTest1_3 {

	public static void main(String[] args){
		Point p = new Point();
			p.x = 3;
			p.x = 5;
		System.out.println(p.x);
		System.out.println(p.y);
		System.out.println(p.toString());
	}
	
}
