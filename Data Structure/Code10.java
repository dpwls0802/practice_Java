package lecture;

//1-100000사이 모든 소수 출력
public class Code10 {
	public static void main(String[] args) {
		for (int n=2; n<=100000; n++) {
			boolean isPrime = true;
			for (int i=2; i*i<=n && isPrime; i++) {
				if(n%i == 0)
					isPrime = false;
					//break;
			}
			if (isPrime)
				System.out.println(n);
		}
	}
}
