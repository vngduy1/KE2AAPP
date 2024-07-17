import java.io.*;

//Pointクラス: 2次元座標を表す
class Point implements Serializable {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

//Triangleクラス: 三角形を表す
public class Triangle implements Serializable {
	Point p0; //三角形の頂点0の座標準
	Point p1; //三角形の頂点1の座標準
	Point p2; //三角形の頂点2の座標準
}
