package hw;
import java.util.Scanner;
/*
 * Topic:請寫以類別方式寫一個程式可顯示四位數字的 LED 燈一組，
 * 可根據輸入的四位數字顯示數字。比如說， 由鍵盤輸入 1234 ，則可在螢幕上顯示
 * Date: 2016/11/21
 * Author: 105021030 張廷毓
 */
public class hw04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		num x=new num();
		x.led=sc.nextInt();
		x.n=3;
		run(x.ledFun());//跑 單一數字的位置
		run(x.ledFun());
		run(x.ledFun());
		run(x.ledFun());
		x.print();
	}
	public static void run(int z) {
		num x=new num();
		if(z==1){//2..3..4..5..6..7..8..9..0..
			x.one();	x.num();// num為下個數字的位置移動
		}
	}
}
class num{//陣列做格子    數字  空格   數字之間位置更動
public short n;//n間隔  
public int led,ans;//ans 取出單一數字
private char data[][]=new char[9][23];
	public int ledFun(){
	ans=led%10;
	led=led/10;
	return ans;
	}
	public void num(){
		n--;
	}//陣列數字間隔n*(5+1)  陣列做的話(1 為數字之間空格部分 每個數字之間差6)
	public void one(){
		for(int i=0;i<5;i++){
			data[i][4+n*(5+1)]='*';
		}
	}
	public void two(){
		
	}
	public void three(){
		
	}
	public void four(){
		
	}
	public void five(){
		
	}
	public void six(){
		
	}
	public void seven(){
		
	}
	public void eight(){
		
	}
	public void nine(){
		
	}
	public void zero(){
		
	}
	public void space(){
		for(int i=0;i<5;i++){
			for(int j=0;j<1;j++){
				System.out.print("  ");
			}
				System.out.println();
				System.out.println();
		}
	}
	public void print(){
		for(int i=0;i<9;i++){
			for(int j=0;j<23;j++){
				System.out.print(data[i][j]);
			}
			System.out.println();
		}
	}		
	
}
