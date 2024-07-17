import java.util.ArrayList;
import java.util.Comparator;

//ke2a04
//ヴゴックズイ
//2024/05/22

class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	int sum() {
		return this.x + this.y;
	}
	

	@Override
	public String toString() {
		return "(" + x + "," + y + ")->" + sum();
	}
}

public class Jv0606 {
	public static void main(String[] args) {
		ArrayList<Point> pointList = new ArrayList<Point>();
		pointList.add(new Point(3,3));
		pointList.add(new Point(1,6));
		pointList.add(new Point(0,8));
		pointList.add(new Point(2,9));
		
		pointList.sort(new Comparator<Point>() {
			public int compare(Point p0, Point p1) {
				return (p0.x + p0.y) - (p1.x + p1.y);
			}
		});

		pointList.forEach(point -> System.out.println(point));
	}
}
