package bai_tap_java_core;

import java.util.Scanner;

public class Bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap so tu nhien");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Cac uoc so la:");
		for(int i=-num;i<=num;i++) {
			if(i==0) {
				continue;
			}
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
	}

}
