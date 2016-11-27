package hw;
import java.util.Scanner;
/*
 * Topic:請寫一個遞迴程式，輸入一個 int 型態的資料，
 * 並回傳該資料在二進制下有多少個位元是 1，例如: 輸入 13 得到結果為 3
 * Date: 2016/11/21
 * Author: 105021030 張廷毓
 */
public class hw03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("輸入數字, 此數的進制為:");
		System.out.print(fun(sc.nextInt(),sc.nextShort()));
	}
	public static int fun(int x,short a) {
		int count=0;
		int sum=0;
		while(x>0){//全轉十進制 -->sum
			sum=sum+(x%10)*(int)Math.pow(a,count);
			count++;
			x=x/10;
		}//sum為轉換十進制
		if(sum==1){
			return 1;
		}
		else if(sum==0){
			return 0;
		}
		else if(sum%2==1){
			return fun(sum/2,a)+1;
		}
		else
			return fun(sum/2,a)+0;
	}
}
