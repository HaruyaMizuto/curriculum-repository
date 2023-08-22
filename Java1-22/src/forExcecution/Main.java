package forExcecution;
// java.util.Objectsをインポート
import java.util.Objects;

// forOutputパッケージのOutputクラスをインポート
import forOutput.Output;

public class Main {
	public static void main(String[] args) {
		// Outputクラスのインスタンスを初期化
		Output o = new Output("日本", "寿司");
		
		// nullチェック
		if(Objects.nonNull(o)) {
			// メソッドの呼び出し
			o.greeting();
			// メソッドの呼び出し
			o.taste();
			// メソッドの呼び出し
			o.whereNationalFood();
			// メソッドの呼び出し
			o.nowDateTime();
		}
	}

}
