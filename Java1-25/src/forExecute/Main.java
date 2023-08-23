package forExecute;
// Objectsクラスをインポート
import java.util.Objects;

// Outputクラスをインポート
import forProcessing.Output;

public class Main {

	public static void main(String[] args) {
		// インスタンスを生成
		Output o = new Output();
		//メソッドを呼び出し
		if(Objects.nonNull(o)) {
			
			// メソッドを呼び出し
			o.output();
		}
	}

}
