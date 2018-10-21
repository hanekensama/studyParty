package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.sun.tools.classfile.Opcode.Set;

public class testMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		// 値の追加 (C)
		map.put(100, "kasai");
		map.put(5, "ishikawa");
		map.put(17, "haneda");
		
		// 値の取得 (R)
		String name = map.get(100);
		System.out.println(name);
		System.out.println(map.get(5)); 
		System.out.println(map.get(1)); // 格納されていない場合はnull
		
		// 値の上書き (U)
		map.put(100, "tamaki");
		System.out.println(map.get(100));
		
		// 値の削除 (D)
		map.remove(100);
		System.out.println(map.get(100));
		
		// すべての値に対して操作する (コッチがオススメ)
		for (Integer key : map.keySet()) {
			String value = map.get(key);
					
			System.out.println(key + ":" + value);
		}
		
		// すべての値に対して操作する
		for (Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ":" + value);
		}
		
	}

}
