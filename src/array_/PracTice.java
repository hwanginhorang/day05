package array_;

public class PracTice {
	public static void main(String[] args) {
		int[] arr = new int[] {10, 54, 13, 17, 25, 30};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			if(arr[i] % 2 == 0) {
				System.out.println("짝수 : "+arr[i]);
				continue;
			}
			System.out.println("홀수 : "+arr[i]);
		}
		System.out.println("===========================");
		for(int a : arr) {
			System.out.println(a);
			if(a % 2 == 0) {
				System.out.println("짝수 : "+a);
				continue;
			}
			System.out.println("홀수 : "+a);
		}
	}
}
