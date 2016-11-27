package hw;
import java.util.Scanner;

/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換 (必須使用遞迴)
 * Date: 2016/11/21
Author: 105021030 張廷毓
 */
public class hw02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("請輸入要轉換的數字,輸入為幾進制,輸出為幾進制:");
		System.out.print(fun(sc.nextInt(),sc.nextShort(),sc.nextShort()));
	}
	public static String fun(int x,short a,short b) {
		int count=0;
		int sum=0;
		while(x>0){//全轉十進制 -->sum
			sum=sum+(x%10)*(int)Math.pow(a,count);
			count++;
			x=x/10;
		}//sum為轉換十進制
		if(sum/b==0){
			return ""+sum%b;
		}
		else if(sum%b==1){
			return fun(sum/b,a,b)+1;
		}
		else if(sum%b==2){
			return fun(sum/b,a,b)+2;
		}
		else if(sum%b==3){
			return fun(sum/b,a,b)+3;
		}
		else if(sum%b==4){
			return fun(sum/b,a,b)+4;
		}
		else if(sum%b==5){
			return fun(sum/b,a,b)+5;
		}
		else if(sum%b==6){
			return fun(sum/b,a,b)+6;
		}
		else if(sum%b==7){
			return fun(sum/b,a,b)+7;
		}
		else if(sum%b==8){
			return fun(sum/b,a,b)+8;
		}
		else if(sum%b==9){
			return fun(sum/b,a,b)+9;
		}
		else
			return fun(sum/b,a,b)+0;
	}
}
