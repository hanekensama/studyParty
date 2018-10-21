package Collection;

public class testString {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 宣言，初期化
		String str1 = "abc";
		
		// 後ろに追加する Listのadd
		str1 += "def";
		System.out.println(str1);
		
		// 文字列の同値判定
		System.out.println(str1.equals("abcdef"));
		System.out.println(str1.equals("ABCDEF"));
		System.out.println(str1.equalsIgnoreCase("ABCDEF"));
		
		// 文字列の比較(辞書順)
		System.err.println("abc".compareTo("def") < 0);
		System.err.println("acb".compareTo("abc"));
		
		// 小文字大文字の変換
		String str2 = str1.toUpperCase(); // 大文字に変換
		System.out.println(str2);
		str2 = str2.toLowerCase(); // 小文字に変換
		System.out.println(str2);
		
		// 空の文字列かどうかチェックする
		System.out.println(str2.isEmpty());
		System.out.println(new String().isEmpty());
		
		// 文字列の切り出し
		str2 = str1.substring(1, 3);
		System.out.println(str2);
		str2 = str1.substring(0, 3);
		System.out.println(str2);
		str2 = str1.substring(0, str1.length() - 1);
		System.out.println(str2);
		str2 = str1.substring(1, str1.length());
		System.out.println(str2);
		
		str2 = str1.substring(0, 1) + str1.substring(3, str1.length());
		System.out.println(str2);
		
		// 文字を置き換える
		str2 = str1.replace("abc", "def");
		System.out.println(str2);
		str2 = str1.replace("b", "");
		System.out.println(str2);
		
		// 文字列を切り分ける
		String[] strs = "hello I'm kasai thinking power is 3".split(" ");
		for (String s : strs) {
			System.out.println(s);
		}
		
		char[] chars = str1.toCharArray();
		str2 = "[";
		for (char c : chars) {
			// for (int i = 0; i < chars.length; i++) {
			// char c = chars[i];
			str2 += c + ",";
		}
		
		System.out.println(str2.substring(0, str2.length() - 1) + "]");
		
		
		System.out.print(chars[0]);
		for (int i = 1; i < chars.length; i++) {
			System.out.print("," + chars[i]);
		}
		System.out.println();
	}
	
}
