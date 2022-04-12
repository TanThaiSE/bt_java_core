package bai_tap_java_core;

import java.util.Scanner;

public class Bai10 {

	static boolean checkSNT(int n) {
		if(n<2)
		{
			return false;
		}
		else if(n==2) {
			return true;
		}
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so n");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(checkSNT(i)) {
				sum+=i;
			}
		}
		System.out.println("Tong cac so nguyen to: "+sum);
	}

}
