package MirrorPattern;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			int p=i-1;
			for(int k=1;k<=i-1;k++) {
				System.out.print("*");
				p--;
				
			}
			System.out.println();
		}

	}

	}


