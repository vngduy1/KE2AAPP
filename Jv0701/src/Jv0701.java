//ke2a04
//ヴゴックズイ
//2024/05/24

import java.io.*;

public class Jv0701 {
	public static void main(String[] args) {
		System.out.println("あなたのお前は？ ");
		//標準入力用入力ストリーム
		InputStreamReader in = new InputStreamReader(System.in);
		//標準入力用カバッファ
		try (BufferedReader reader = new BufferedReader(in)) {
			String name = reader.readLine();
			System.out.println("こんにちは。" + name + "さん");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
