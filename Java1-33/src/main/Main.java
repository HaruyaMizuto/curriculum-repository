package main;

class Main{
	public static void main(String[] args){
		/*
		 * 問題1：インスタンスフィールドに「lastName」を追加しましょう
		 * 問題2：lastNameの値を引数で受け取るコンストラクタを追加で定義してください
		 * ※順番はfirstNameの次
		 * 問題3：作成したコンストラクタの中に「Person.count++; this.lastName;」を追加しlastNameフィールドの値をセットしてください
		 */
		
		// インスタンスを生成
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		// メソッドの呼び出し
		person1.print();
		
		// インスタンスを生成
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		// メソッドの呼び出し
		person2.print();

		// メソッドの呼び出し
		Person.printCount();
		
		
	}
}