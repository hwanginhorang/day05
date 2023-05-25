package array_;

import java.util.Scanner;

public class TestClass05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[] {10, 54, 13, 17, 25, 30};
		String a = null;
		
		System.out.println("짝수, 홀수 입력 : ");
		a = input.next();
		
		for(int i=0; i<arr.length; i++) {
			if(a.equals("짝수")) {
				if(arr[i] % 2 == 0) {
					System.out.println("짝수: "+arr[i]);
				}
			}else if(a.equals("홀수")){
				if(arr[i] % 2 == 1) {
					System.out.println("홀수: "+arr[i]);
				}
			}
		}
	}
}
