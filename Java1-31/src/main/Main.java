package main;

class Main {
	/*
	 * 問題1：Vehicleクラスを作成し、String型のprivateなインスタンスフィールド「owner」を定義しましょう。
	 * 問題2：CarクラスとBicycleクラスを作成しましょう。
	 * 問題3：Vehicleクラスにownerフィールドのゲッター「getOwner」とセッター「setOwner」を定義しましょう。
	 * 
	 * 問題4：MainクラスにsetOwnerを用いて、Carクラスのインスタンス「car」の所有者を「person1」に、
	 * Bicycleクラスのインスタンス「bicycle」の所有者を「person2」に設定します。
	 * Personクラスのインスタンスからフルネームを取得し、ownerにセットしてください。 
	 * 
	 * 問題5：セットできたら、ownerをコンソールに出力してください。
	 * 
	 * 問題6：Personクラスにインスタンスメソッド「buy」を定義しましょう。（仮引数：car）
	 * 問題7：buyメソッドの中でsetOwnerメソッドとthisを用いてownerフィールドの値をセットしましょう。
	 * 問題8：さらに、「〇〇が購入しました」と出力する処理を追加してください。
	 * 問題9：引数の型が異なるbuyメソッドを定義しましょう。（仮引数：bicycle）
	 * 
	 * 問題10：Mainクラスからbuyメソッドを用いて、「person1」がcarを購入、「person2」がbicycleを購入するプログラムを作成しましょう。
	 */
	public static void main(String[] args) {
		// インスタンスを初期化
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		Person person2 = new Person("山田花子", 22, 1.5, 40);
		
		// インスタンスを初期化
		Car car = new Car();
		Bicycle byc = new Bicycle();
		
		// それぞれにオーナーを設定
		car.setOwner(person1.name);
		byc.setOwner(person2.name);
		
		// 問5 コンソールに出力
		System.out.println(car.getOwner());
		System.out.println(byc.getOwner());
		
		// 問10 メソッドの呼び出し
		person1.buy(car);
		person2.buy(byc);
	}
}
