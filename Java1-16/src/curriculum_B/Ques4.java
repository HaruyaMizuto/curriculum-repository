package curriculum_B;

public class Ques4 {

	public static void main(String[] args) {
		/*
		 * Q4 for文を使って見本の通りに出力してください
		 */
		// int型を1から9の範囲として繰り返し処理
		for (int i = 1; i < 10; i++) {
			
			// int型を1から9の範囲で繰り返し処理
			for (int j = 1; j < 10; j++) {
				
				// コンソールに出力
				System.out.printf("%02d * %02d = %02d", i, j, i * j);
				// コンソールに出力
				System.out.print(j < 9 ? " || " : "\n");
			}
		}
	}
}