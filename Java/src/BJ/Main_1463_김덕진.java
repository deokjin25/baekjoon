package BJ;

import java.util.Scanner;

public class Main_1463_김덕진 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[] dp = new int[x+1];
		//1을 뺐을 때랑 2로 나눠서 봤을때랑 3으로 나눠서 봤을 때를 모두 '비교'(else if x)
		for (int i = 2; i <= x; i++) {
			dp[i] = dp[i-1]+1;
			if(i%2 == 0) {
				dp[i] = Math.min(dp[i], dp[i/2]+1);
			}
			if(i%3==0) {
				dp[i] = Math.min(dp[i], dp[i/3]+1);
			}
		}
		
		System.out.println(dp[x]);
	}

}
