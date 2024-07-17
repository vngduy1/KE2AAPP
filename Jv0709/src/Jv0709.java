//ke2a04
//ヴゴックズイ
//2024/06/05

import java.io.*;

public class Jv0709 {
	public static void main(String[] args) {
		try (
			//ファイル入力用のストリームを構築
			FileReader fr = new FileReader("C:/java/test.txt");
			BufferedReader br = new BufferedReader(fr);
			//ファイル出力用のストリームを構築	
			FileWriter fw = new FileWriter("C:/java/test2.txt");
			BufferedWriter bw = new BufferedWriter(fw)) 
		{
			String s;   //1行ずつ読み込んだ文字列を格納する
			int lineNumber = 1;   //行番号のカウントをする
			while ((s = br.readLine()) != null) {
				bw.write(lineNumber + ":" + s);
				bw.newLine();
				lineNumber++;
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}