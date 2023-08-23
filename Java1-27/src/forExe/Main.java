package forExe;
// Objectsクラスをインポート
import java.util.Objects;
// Scannerクラスをインポート
import java.util.Scanner;

// Outputクラスをインポート
import forProcess.Output;

public class Main {

	public static void main(String[] args) {

		// コンソールに出力
		System.out.println("コンソールに文字を入力してください");

		// インスタンスを初期化
		Scanner sc = new Scanner(System.in);
		// 入力された文字列を取得
		String sample = sc.nextLine();
		// スキャナーを閉じる
		sc.close();
		
		// nullチェック
		if (Objects.nonNull(sample)) {
			
			// Animalクラスのインスタンスを初期化
			Output o = new Output(sample);
			
			// nullチェック
			if(Objects.nonNull(o)) {
				
				// メソッドを呼び出し
				o.output();
			}
		}
	}

}
