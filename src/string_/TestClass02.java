package string_;

public class TestClass02 {
	public static void main(String[] args) {
		String str = new String("test");
		String str2 = "test";
		System.out.println(str);
		System.out.println(str2);
		
		String id = "aaa  ";
		String inputId = "aaa";
		System.out.println(id.equals(inputId));
		System.out.println(id);
		System.out.println(inputId);
		System.out.println(id.trim()+".");
		
		String addr = "서울 010 김길이/1020239";
		String[] addrs = addr.split("/");
		for(String s: addrs) {
			System.out.println(s);
		}
		
		String repl = addr.replace("/", "==>");
		System.out.println(repl);
	}
}
