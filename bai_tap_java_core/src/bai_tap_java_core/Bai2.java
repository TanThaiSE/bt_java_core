package bai_tap_java_core;

public class Bai2 {

	static void desToBin(int num) {
		String result="";
		while(num!=0) {
			result=result+(num%2);
			num/=2;
		}
		StringBuffer sbr=new StringBuffer(result);
		sbr.reverse();
		System.out.println("He 10 sang he 2: "+sbr);
	}
	static void binToDes(String num) {
		int result=0;
		int mu=1;
		for(int i=num.length()-1;i>=0;i--) {
			result+=Integer.parseInt(String.valueOf(num.charAt(i)))*mu;
			mu*=2;
		}
		System.out.println("He 2 sang he 10: "+result);
	}
	public static void main(String[] args) {
		desToBin(47);
		binToDes("101111");
	}

}
