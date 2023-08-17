package curriculum_B;
// java.util.Randomパッケージをインポート
import java.util.Random;
// java.util.Scannerパッケージをインポート
import java.util.Scanner;

public class Ques6 {

	public static void main(String[] args) {
		/*
		 * Q6入力した商品の残り台数が出力されるシステムを下記の条件で作成してください
		 * ・拡張for文・Switch文・条件演算子を使用すること　※普通のif文は使用不可
		 * ・Switch文内でテレビとディスプレイは続けて書くようにしてください、条件演算子で出力される値を変更してください
		 * ・テレビとディスプレイは同じ商品扱いとし、ディスプレイが出た場合は最大個数の11個からランダムで出た数字を引いて出力してください 
		 * ・例：テレビと受け取った場合、→「テレビの残り台数は〇〇台です」※〇〇はランダムで出た数字
		 * ・入力される値は右記の表のどれかが入力され、入力回数の縛りはありません
		 * ・入力された値は「、」区切りで指定してください
		 * ・そのほかの値が入力された場合下記を出力されるようにしてください
		 *    『受け取った値』は指定の商品ではありません
		 * ・残り台数は0〜11までのランダムな値が出力されるようにしてください
		 * 
		 * 入力例↓↓
		 * パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品
		 * 
		 * 出力例↓↓
		 * パソコンの残り台数は8台です
		 * 冷蔵庫の残り台数は7台です
		 * 扇風機の残り台数は7台です
		 * 洗濯機の残り台数は10台です
		 * 加湿器の残り台数は3台です
		 * テレビの残り台数は9台です
		 * ディスプレイの残り台数は2台です
		 * 『 その他商品 』は指定の商品ではありません
		 */
		
		// Scannerクラスのインスタンスを初期化
		Scanner sc2 = new Scanner(System.in);
		//  製品名を宣言して入力された文字列を代入
		String product = sc2.nextLine();
		// 製品名をカンマ区切りで分けてそれぞれを要素とした配列を宣言
		String[] products = product.split("、");
		// Randomクラスのインスタンスを初期化
		Random random = new Random();
		// 残り台数の変数を宣言
		int num = 0;
		// 残り台数の変数を宣言してランダムに出た数字を代入する
		int num2 = random.nextInt(12);
		
		// 配列の要素それぞれ繰り返し処理
		for (String productName : products) {
			
			// 残り台数を0～11でランダムに出た数字を代入
			num = random.nextInt(12);
			// 製品によって処理を変える
			
			switch (productName) {
			
			// パソコンのとき
			case"パソコン":
				
				// コンソールに出力
				System.out.println("パソコンの残り台数は" + num + "台です");
				break;
				
			// 冷蔵庫のとき
			case"冷蔵庫":
				
				// コンソールに出力
				System.out.println("冷蔵庫の残り台数は" + num + "台です");
				break;
				
			// 扇風機のとき
			case"扇風機":
				
				// コンソールに出力
				System.out.println("扇風機の残り台数は" + num + "台です");
				break;
				
			// 洗濯機のとき
			case"洗濯機":
				
				// コンソールに出力
				System.out.println("洗濯機の残り台数は" + num + "台です");
				break;
				
			// 加湿器のとき
			case"加湿器":
				
				// コンソールに出力
				System.out.println("加湿器の残り台数は" + num + "台です");
				break;
				
			// テレビ、ディスプレイのとき
			case"テレビ":
			case"ディスプレイ":
				
				// テレビのときは残り台数をそのまま、ディスプレイのときは11から残り台数を引いた数字を残り台数として文字列を決定
				String result = productName.equals("テレビ") ? "テレビの残り台数は" + num2 + "台です" : "ディスプレイの残り台数は" + (11 - num2) + "台です"; 
				// コンソールに出力
				System.out.println(result);
				break;
				
			// それら以外のとき
			default:
				
				// コンソールに出力
				System.out.println("『 " + productName +" 』は指定の商品ではありません");
				break;
			}
			// コンソールを改行
			System.out.println("");
		}
	}

}
