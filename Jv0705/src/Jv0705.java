//ke2a04
//ヴゴックズイ
//2024/05/31

import java.io.*;

public class Jv0705 {
	public static void main(String[] args) {
		// ファイル保存する三角形オブジェクト
		Triangle tri = new Triangle();
		tri.p0 = new Point(0, 0);
		tri.p1 = new Point(10, 0);
		tri.p2 = new Point(5, 10);
		
		// 三角形オブジェクトをファイルに出力するストリーム
		try (
			FileOutputStream fs = new FileOutputStream("C:/java/triangle.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs)) 
		{
			os.writeObject(tri);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
