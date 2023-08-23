package forProcessing;
// Objectsクラスをインポート
import java.util.Objects;
// Randomクラスをインポート
import java.util.Random;
// Scannerクラスをインポート
import java.util.Scanner;

public class Output extends Status{
	// フィールド変数
	private String name;// 名前

	// コンストラクタ
	public Output() {

		//　Scannerクラスのインスタンスを初期化
		Scanner s = new Scanner(System.in);
		// 入力された値を取得
		String inputName = s.nextLine();
		// 入力された値を代入して名前を設定
		name = inputName;
		// スキャナーを閉じる
		s.close();

		// ステータスを設定
		// インスタンスを初期化
		Random rand = new Random();
		// nullチェック
		if (Objects.nonNull(rand)) {
			
			// HPを設定
			setHp(rand.nextInt(999) + 1);
			// MPを設定
			setMp(rand.nextInt(999) + 1);
			// 攻撃力を設定
			setAttack(rand.nextInt(999) + 1);
			// 素早さを設定
			setDex(rand.nextInt(999) + 1);
			// 防御力を設定
			setResist(rand.nextInt(999) + 1);
		}
	}

	// 出力メソッド
	public void output() {
		// nullチェック
		if (Objects.nonNull(name)) {
			
			// 挨拶を出力
			System.out.println("こんにちは 「 " + name + " 」 さん");
		}
		
		// コンソールに出力
		System.out.println("ステータス");
		// コンソールに出力
		System.out.println("HP：" + getHp());
		// コンソールに出力
		System.out.println("MP：" + getMp());
		// コンソールに出力
		System.out.println("攻撃力：" + getAttack());
		// コンソールに出力
		System.out.println("素早さ：" + getDex());
		// コンソールに出力
		System.out.println("防御力：" + getResist());
		// コンソールに出力
		System.out.println("\n");

		// コンソールに出力
		System.out.println("さあ冒険に出かけよう！");
	}
}
