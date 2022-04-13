package bai_tap_java_core;

import java.util.Scanner;

public class Bai22 {
	static int expandFromMiddle(String s,int left,int right) {
		if(s==null||left>right) {
			return 0;
		}
		while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)) {
			left-=1;
			right+=1;
		}
		return right-left+1;
	}
	static String longestSubStringPalindromic(String s) {
		if(s==null||s.length()<0) {
			return "";
		}
		int start=0;
		int end=0;
		for(int i=0;i<s.length();i++) {
			int len1=expandFromMiddle(s, i, i);//th le
			int len2=expandFromMiddle(s, i, i+1);//th chan
			int len=Math.max(len1, len2);
			if(len>end-start) {
				start=i-((len-1)/2);
				end=i+(len/2);
			}	
		}
		return s.substring(start,end+1);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap chuoi");
		String s=sc.nextLine();
		System.out.println(longestSubStringPalindromic(s));
	}

}
