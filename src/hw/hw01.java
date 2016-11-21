package hw;
import java.util.Scanner;
/*
 * Topic: 請寫一個 遞迴函式	進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021030 張廷毓
 */
public class hw01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("請輸入十進制數字:");
		System.out.print(fun(sc.nextLong()));
	}
	public static String fun(long x){
		if(x==1){
			return "1";
		}
		else if(x%2==1){
			return fun(x/2)+1;
		}
		else
			return fun(x/2)+0;
	}
	
}
