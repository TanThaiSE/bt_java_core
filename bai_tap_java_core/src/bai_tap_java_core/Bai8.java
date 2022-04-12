package bai_tap_java_core;

import java.util.Scanner;

public class Bai8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap chuoi: ");
		Scanner sc=new Scanner(System.in);
		String chuoi=sc.nextLine();
		String[] lstChuoi=chuoi.split(" ");
		for(String s:lstChuoi) {
			String temp=s.substring(0, 1).toUpperCase() + s.substring(1);
			System.out.print(temp+" ");
		}
	}

}
