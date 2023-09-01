package main;

class Person{
	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height; 
	public double weight;
	public int count;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.count++;
	}
	
	public double bmi() {
		// BMIを計算して返す
		return weight / (height * height);
	}
	
	public void print() {
		// コンソールに出力
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + this.bmi() + "です");
		System.out.println("合計"+ this.count +"人です");
	}
	
	public void buy(Car car) {
		// ownerを設定
		car.setOwner(this.name);
		// コンソールに出力
		System.out.println(car.getOwner() + "が購入しました");
	}
	
	public void buy(Bicycle byc) {
		// ownerを設定
		byc.setOwner(this.name);
		// コンソールに出力
		System.out.println(byc.getOwner() + "が購入しました");
	}
}
