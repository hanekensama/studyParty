package Collection;

import java.util.ArrayList;
import java.util.List;

public class testList {

	public static void main(String[] args) {
		//準備
		// List<入れるものの型> 名前 = new ArrayList<>();
		List<String> list = new ArrayList<>();
		
		// 要素数を取る list.size();
		print(list);
		
		// 値を末尾に入れる
		list.add("1");
		list.add("2");
		list.add("9");
		list.add("10");
		list.add("a");
		list.add("A");
		print(list);
		
		System.out.print(list.get(0));           // まず1個目だけを分けて出力する
		for (int i = 1; i < list.size(); i++) {  // 2個目から最後まで
			System.out.print(" " + list.get(i)); // 空白+値の順で出力
		}
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		System.out.print(list.get(list.size() - 1)); // リストの最後の要素を出力
		for (int i = list.size() - 2; i >= 0; i--) {
			System.out.print(" " + list.get(i));
		}
		System.out.println();
		
		// 値を取る
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		// 値を間に入れる
		list.add(2, "third"); // 2番の場所に値を追加する
		print(list);
		list.add(2, "data");
		print(list);
		
		// 値を上書きする
		list.set(2, "3");
		print(list);
		
		// 値を削除する
		// list.remove(2);
		// print(list);
		
		// 最後の要素を取得する
		System.out.println( list.get(list.size() - 1) );
		// 最後の要素を削除する
		// list.remove(list.size() - 1);
		// print(list);
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(6);
		numbers.add(4);
		numbers.add(5);
		for (int integer : numbers) System.out.print(integer + " ");
		System.out.println();
		
		numbers.sort(null);
		for (int integer : numbers) System.out.print(integer + " ");
		System.out.println();
		
		list.sort(null);
		print(list);
	}
	
	public static void print(List<String> list) {
		System.out.print("size:" + list.size() + " ");
		System.out.println("[" + String.join(",", list) + "]");
	}
}
