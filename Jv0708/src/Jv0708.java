
//ke2a04
//ヴゴックズイ
//2024/06/05

import java.io.*;

public class Jv0708 {
	public static void main(String[] args) {
		// ファイルのパスを定義
		File dir1 = new File("testA");
		File dir2 = new File("testA/testB/testC");
		
		if(dir1.mkdir()) {
			System.out.println(dir1 + " を作成しました");
		} else {
			System.out.println(dir1 + " の作成に失敗しました。");
		}
		
		if(dir2.mkdirs()) {
			System.out.println(dir2 + " を作成しました");
		} else {
			System.out.println(dir2 + " の作成に失敗しました。");
		}
		
		String[] fileList = dir1.list();
		for(String s : fileList) {
			System.out.println(s);
		}
	}
}
