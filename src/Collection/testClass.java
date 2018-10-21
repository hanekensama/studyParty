package Collection;

public class testClass {

	public static void main(String[] args) {
		Person kasai = new Person();
		kasai.name = "tomoya";
		kasai.age = 20000;
		kasai.thinking_power = 4;
		
		kasai.selfIntroduction();
		
		Person haneda = new Person();
		haneda.name = "kentaro";
		haneda.age = 24;
		
		kasai.olderThan(haneda);
		
		Person ishikawa = new Person();
		ishikawa.name = "hirokazu";
		ishikawa.age = 23;
		
		kasai.olderThan(ishikawa);
	}

	public class Person {
		// データ
		private String name;
		private int age;
		private int thinking_power;
		
		// 処理
		public Person() { // コンスタクタの名前はクラスの名前と同じ
			this.name = "tamaki";
			this.age = 0;
		}
		
		public void selfIntroduction() {
			System.out.println(this.name + this.age);
		}
		
		public boolean olderThan(Person other) {
			if (this.age > other.age)
				return true;
			else
				return false;
		}
	}
}

