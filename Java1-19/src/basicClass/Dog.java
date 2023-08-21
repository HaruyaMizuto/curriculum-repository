package basicClass;

public class Dog {
	
	// Q1：フィールドに動物の名前の変数を定義してください。
	public static String animalName = null;
	
	// Q2：フィールドに動物の数の変数を定義してください。
	public static int animalNum = 0;
	
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	Dog(){
		Dog.animalName = "犬";
	}
	
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	Dog(int animalNum){
		Dog.animalNum = animalNum;
	}
}
