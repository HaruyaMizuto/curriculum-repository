package curriculum;
// Objectsクラスをインポート
import java.util.Objects;

public class Main {

	public static void main(String[] args) {
		// Animalクラスの呼び出し
		Animal lion = new Animal();

		// nullチェック
		if (Objects.nonNull(lion)) {
			
			// 動物名をライオンに設定
			lion.setName("ライオン");
			// 体長を2.1mに設定
			lion.setSize(2.1);
			// 速度を80km/hに設定
			lion.setSpeed(80);

			// 動物名を取得してコンソールに出力
			System.out.println("動物名：" + lion.getName());
			// 体長を取得してコンソールに出力
			System.out.println("体長：" + lion.getSize() + "m");
			// 速度を取得してコンソールに出力
			System.out.println("速度：" + lion.getSpeed() + "km/h");
		}
	}
}
