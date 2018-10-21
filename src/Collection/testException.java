package Collection;

public class testException {

	public static void main(String[] args) {
		int x = 10;
		System.out.println(hoge(x));
	
		String str1 = "abcd";
		String str2 = "12345";
		String str3 = "123ab";
		String str4 = "-123";
		System.out.println(check(str1));
		System.out.println(check(str2));
		System.out.println(check(str3));
		System.out.println(check(str4));
		

	}
	
	static int hoge(int a) {
		int ret = 0;
		try {
			ret = divide(a, 0);
		} catch(ArithmeticException e) {
			System.err.println("エラー出たでー");
			return 1;
		}
		return ret;
	}
	
	static int divide(int a, int b) {
		if (b == 0) 
			throw new ArithmeticException();
		else
			return a / b;
	}
	
	static boolean check(String str) {
		try {
			Integer.parseInt(str);
		} catch(Exception e) {
			return false;
		}
		return true;
	}
}
