package bai_tap_java_core;

import java.util.Scanner;

public class Bai18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so tien hien co cua X");
		int moneyCurrent=sc.nextInt();
		System.out.println("Nhap gia tien oto");
		int carPrice=sc.nextInt();
		System.out.println("Nhap lai suat hang nam");
		double laiSuat=sc.nextDouble();
		double year=(Math.log(carPrice*1.0/moneyCurrent) / Math.log(1+laiSuat*1.0/100));
		System.out.println("So nam it nhat la: "+Math.round(year));
	}

}
