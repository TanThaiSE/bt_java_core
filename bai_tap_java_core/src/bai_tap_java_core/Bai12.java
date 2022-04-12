package bai_tap_java_core;

import java.util.Scanner;

public class Bai12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
	}

}
