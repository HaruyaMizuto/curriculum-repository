package curriculum_B;

public class Ques4 {

	public static void main(String[] args) {
		/*
		 * Q4 for文を使って見本の通りに出力してください
		 */
		//int型iを1から9の範囲として繰り返し処理
		for (int i = 1; i < 10; i++) {
			//String型line1を定義
			String line1 = "";
			//int型kを1から9の範囲として繰り返し処理
			for (int k = 1; k < 10; k++) {
				//line1に2桁で0埋めした、iとkの積を求める式を自己代入していく
				line1 += (String.format("%02d", i) + " * " + String.format("%02d", k) + " = " + String.format("%02d",i * k) + " || ");
			}
			//line1をコンソールに出力
			System.out.println(line1);
		}
	}
}
