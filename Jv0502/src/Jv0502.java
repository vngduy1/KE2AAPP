import java.util.ArrayList;

//ke2a04
//ヴゴックズイ
//2024/05/08

public class Jv0502 {
	public static void main(String[] args) {
		//実数を２つ格納する配列リスト
		ArrayList<Double> dList = new ArrayList<Double>();
		
		//ラッパーオプジェクトに格納する基本データ型変数
		double d12 = 1.2;
		//double形データをArrayListに格納するためのラッパーオプジェクト
		Double dbl_12 = Double.valueOf(d12);
		dList.add(dbl_12);   //add(Double)
		
		//オートボクシングでArrayListに格納する基本データ型変数
		double d34 = 3.4;
		dList.add(d34);    //add(double) => add(Double.valueOf(double))
		
		System.out.println(dList.get(0).doubleValue());
		System.out.println(dList.get(1));     //=> get(1).doubleValue()
	}
}
