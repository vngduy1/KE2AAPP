import java.io.*;
import java.net.*;
//ke2a04
//ヴゴックズイ
//2024/07/12

public class Jv1001SV {

	public static void main(String[] args) {
		try {
		    ServerSocket serverSocket = new ServerSocket(5000); // 別のポート番号を使用
		    while (true) {
		    	Socket socket = serverSocket.accept();
		    	
		    	PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
		    	printWriter.println("こんにちは。私はヴゴックズイです");
		    	
		    	printWriter.close();  // クライアントとの接続を閉じる
		    }
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
