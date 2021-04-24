package MirrorPattern;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p=n;
		for(int i=1;i<=n;i++) {
			for(int j=p;j>0;j--) {
				System.out.print(p+" ");
			}
		  p--;
		
			System.out.println();
		}
	}

}
