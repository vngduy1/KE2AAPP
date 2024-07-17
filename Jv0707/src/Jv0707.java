//ke2a04
//ヴゴックズイ
//2024/06/05

import java.io.*;

public class Jv0707 {
	public static void main(String[] args) {
		// ファイルのパスを定義
		File file = new File("C:/java/triangle.ser"); //削除ファイル
		if(!file.exists()) {
			System.out.println(file + "がありません");
			return;
		}
		
		if(file.delete()) {
			System.out.println(file + "を削除しました");
		} else {
			System.out.println(file + "を削除できませんでした");
		}
	}
}
