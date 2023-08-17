package curriculum_B;

public class Ques5 {

	public static void main(String[] args) {
		/*
		 * Q5 for文を使って見本の通りに出力してください
		 */
		// 1から9の範囲として繰り返し処理
		for (int k = 1; k < 10; k++) {
			
			// 1から21の範囲を繰り返し処理
			for (int l = 1; l < 21; l++) {
				
				// 数字を3桁まで0埋めしてコンソールに出力
				System.out.printf("%03d * %03d = %03d", l, k, l * k);
				// コンソールに出力
				System.out.print(l < 20 ? " || " : "\n");
			}
		}
	}
}
