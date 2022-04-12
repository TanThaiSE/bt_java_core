package bai_tap_java_core;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so tu nhien:");
		int num=sc.nextInt();
		int sum=0;
		while(num!=0) {
			sum=sum+num%10;
			num/=10;
		}
		System.out.println("Tong cac chu so cua so tu nhien: "+sum);
	}
}
