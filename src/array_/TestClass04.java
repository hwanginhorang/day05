package array_;

public class TestClass04 {
	public static void main(String[] args) {
		int num = 0;
		String[] s = new String[3];
		double[] d = new double[3];
		System.out.println(s[0]);
		System.out.println(d[0]);
		
		String[] s1 = {"안녕", "그래", "반갑다"};
		double[] d1 = {1.1, 2.2, 3.3};
		
		for(int i=0; i<s1.length; i++) {
			System.out.println(s1[i]);
		}
		System.out.println("------------------");
		
		int k=0;
		for(String ss : s1) {
			System.out.println(k+"."+ss);
			k++;
		}
	}
}
