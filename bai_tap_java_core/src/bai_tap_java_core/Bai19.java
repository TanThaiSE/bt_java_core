package bai_tap_java_core;

import java.util.Scanner;

public class Bai19 {

	static void ptBac1(double num1,double num2) {
		if(num1==0&&num2==0) {
			System.out.println("phuong trinh co vo so nghiem");
		}
		else if(num1==0&&num2!=0) {
			System.out.println("phuong trinh vo nghiem");
		}
		else if(num1!=0) {
			System.out.println("phuong trinh co nghiem la: "+(-num2*1.0/num1));
		}
	}
	static void ptBac2(double num1,double num2,double num3) {
		if(num1==0) {
			ptBac1(num2, num3);
		}
		else {
			double delta=num2*num2-4*num1*num3;
			System.out.println("delta "+delta);
			if(delta<0) {
				System.out.println("phuong trinh vo nghiem");
			}
			else {
				double x1=((-num2+Math.sqrt(delta))/(2*num1));
				double x2=((-num2-Math.sqrt(delta))/(2*num1));
				System.out.println("Phuong trinh co 2 nghiem");
				System.out.println("Nghiem 1: "+x1);
				System.out.println("Nghiem 2: "+x2);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("Nhap 1: giai phuong trinh bac 1");
			System.out.println("Nhap 2: giai phuong trinh bac 2");
			System.out.println("Nhap 3 de thoat");
			System.out.println("Moi ban nhap:");
			int n=sc.nextInt();
			if(n==1) {
				System.out.println("Nhap he so 1");
				double num1=sc.nextDouble();
				System.out.println("Nhap he so 2");
				double num2=sc.nextDouble();
				ptBac1(num1, num2);
			}
			else if(n==2) {
				System.out.println("Nhap he so 1");
				double num1=sc.nextDouble();
				System.out.println("Nhap he so 2");
				double num2=sc.nextDouble();
				System.out.println("Nhap he so 3");
				double num3=sc.nextDouble();
				ptBac2(num1, num2, num3);
			}
			else {
				break;
			}
			
		}
	}

}
