package ex;
import java.util.Scanner;
/*
 * Topic: 請寫一個函式 (不是遞迴) 進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021030 張廷毓
 */
public class ex01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("請輸入十進制數字:");
		System.out.print(fun(sc.nextLong()));
	}
	public static String fun(long x){
		String num="";
		while(x!=1){
			num=x%2+num;
			x=x/2;
		}
		num=1+num;
		return num;
	}
	
}
