package ex;
import java.util.Scanner;
/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 105021030 張廷毓
 */
public class ex02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("請輸入幾進制x[x<=10],	再輸入數字,	轉成幾進制y[y<=10]:");
		System.out.print(fun(sc.nextFloat(),sc.nextInt(),sc.nextShort()));
	}
	public static String fun(float ver,int x,short ver2){
		String num="";//先做 全轉十進制
		int count=0;
		int sum=0;//全轉十進制
		while(x>0){//全轉十進制
			sum=sum+(x%10)*(int)Math.pow(ver,count);
			count++;
			x=x/10;
		}
		if(ver2==10){//如果某進制轉十進制  這邊即可結束
		num=Integer.toString(sum);
		return num;
		}
		while(sum!=ver2-1){   //十進制轉各種進制
			num=sum%ver2+num;
			sum=sum/ver2;
		}
		num=(ver2-1)+num;
		return num;
		
	}
	
}
