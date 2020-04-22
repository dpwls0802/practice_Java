package lecture;

import java.util.Scanner;

//1-100000사이 모든 소수 출력
public class Code11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] data = new int [n];
		
		for (int i = 0; i < n; i++)
			data[i] = sc.nextInt();
		sc.close();
		
		int count = 0;
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if (data[i] == data[j])
					count++;
			}
		}
		System.out.println(count);
	}
}
