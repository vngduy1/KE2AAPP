//ke2a04
//ヴゴックズイ
//2024/05/31

import java.io.*;

public class Jv0706 {
	public static void main(String[] args) {
		// 三角形オブジェクトをファイルに読み込むストリーム
		try (
			FileInputStream fs = new FileInputStream("C:/java/triangle.ser");
			ObjectInputStream os = new ObjectInputStream(fs)) 
		{
			Triangle tri = (Triangle)os.readObject();
			System.out.println(tri.p0.x + "," + tri.p0.y);
			System.out.println(tri.p1.x + "," + tri.p1.y);
			System.out.println(tri.p2.x + "," + tri.p2.y);
		} catch (IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}
}
