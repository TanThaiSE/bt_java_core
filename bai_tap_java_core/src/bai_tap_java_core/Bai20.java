package bai_tap_java_core;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai20 {
	static void phanTuChanLe(int []n) {
		ArrayList<Integer> lstChan=new ArrayList<>();
		ArrayList<Integer> lstLe=new ArrayList<>();
		for(int i=0;i<n.length;i++) {
			if(n[i]%2==0) {
				lstChan.add(n[i]);
			}
			else {
				lstLe.add(n[i]);
			}
		}
		System.out.println("Mang chan");
		for(int i=0;i<lstChan.size();i++) {
			System.out.print(lstChan.get(i)+" ");
		}
		System.out.println("\nMang le");
		for(int i=0;i<lstLe.size();i++) {
			System.out.print(lstLe.get(i)+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so n");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Nhap phan tu thu"+(i+1));
			arr[i]=sc.nextInt();
		}
		phanTuChanLe(arr);
	}

}
