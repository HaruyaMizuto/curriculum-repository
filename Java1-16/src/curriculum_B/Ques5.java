package curriculum_B;

public class Ques5 {

	public static void main(String[] args) {
		/*
		 * Q5 for文を使って見本の通りに出力してください
		 */
		//int型aを1から9の範囲として繰り返し処理
		for (int a = 1; a < 10; a++) {
			//String型line2を定義
			String line2 = "";
			//int型bを1から9の範囲として繰り返し処理
			for (int b = 1; b < 21; b++) {
				//line2に3桁で0埋めした、bとaの積を求める式を自己代入していく
				line2 += (String.format("%03d", b) + " * " + String.format("%03d", a) + " = " + String.format("%03d",b * a) + " || ");
			}
			//コンソールにline2を出力
			System.out.println(line2);
		}
	}
}
