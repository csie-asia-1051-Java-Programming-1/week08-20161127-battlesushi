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
		num numled=new num(sc.nextInt(),3);
		numled.run();
	}
}
class num{//陣列做格子    數字  空格   數字之間位置更動
public int n;//n間隔
public int x;//輸入的數字
public char data[][]=new char[9][23];
	public num(int x1,int n1){
		x=x1;	//輸入的數字
		n=n1;	//n間隔
	}					//陣列數字間隔n*(5+1)  陣列做的話(1 為數字之間空格部分 每個數字之間差6)
	public void run() {
		while(n>=0){
			if(x%10==1){//2..3..4..5..6..7..8..9..0..
				for(int i=0;i<9;i+=2){
					data[i][4+n*(5+1)]='*';
				}
			}
			else if(x%10==2){
				for(int i=0;i<9;i+=4){//2的三橫排
					for(int j=0;j<5;j++)
					data[i][j+n*(5+1)]='*';
				}
					data[2][4+n*(5+1)]='*';//2的剩餘兩點
					data[6][n*(5+1)]='*';	
			}
			else if(x%10==3){
				for(int i=0;i<9;i+=4){//3的三橫排
					for(int j=0;j<5;j++)
					data[i][j+n*(5+1)]='*';
				}
					data[2][4+n*(5+1)]='*';//3的剩餘兩點
					data[6][4+n*(5+1)]='*';
			}
			else if(x%10==4){
				data[0][0+n*(5+1)]='*';
				data[0][4+n*(5+1)]='*';
				data[2][0+n*(5+1)]='*';
				data[2][4+n*(5+1)]='*';
				for(int i=0;i<5;i++){//4的橫排
					data[4][i+n*(5+1)]='*';
				}
					data[6][4+n*(5+1)]='*';
					data[8][4+n*(5+1)]='*';	
			}
			else if(x%10==5){
				for(int i=0;i<9;i+=4){//5的三橫排
					for(int j=0;j<5;j++)
					data[i][j+n*(5+1)]='*';
				}
					data[2][n*(5+1)]='*';//5的剩餘兩點
					data[6][4+n*(5+1)]='*';	
			}
			else if(x%10==6){
				for(int i=0;i<9;i+=4){//6的三橫排
					for(int j=0;j<5;j++)
					data[i][j+n*(5+1)]='*';
				}
					data[2][n*(5+1)]='*';//剩餘三點
					data[6][n*(5+1)]='*';
					data[6][4+n*(5+1)]='*';	
			}
			else if(x%10==7){
				for(int i=0;i<5;i++){//7的橫排
					data[0][i+n*(5+1)]='*';
				}
				for(int i=2;i<9;i+=2){
					data[i][4+n*(5+1)]='*';
				}	
			}
			else if(x%10==8){
					for(int i=0;i<9;i+=4){//8的三橫排
						for(int j=0;j<5;j++)
							data[i][j+n*(5+1)]='*';
				}
					data[2][0+n*(5+1)]='*';//8剩餘4點
					data[2][4+n*(5+1)]='*';
					data[6][0+n*(5+1)]='*';
					data[6][4+n*(5+1)]='*';	
			}
			else if(x%10==9){
					for(int i=0;i<5;i+=4){//9的兩橫排
						for(int j=0;j<5;j++)
							data[i][j+n*(5+1)]='*';
					}
					data[2][0+n*(5+1)]='*';//9剩餘4點
					data[2][4+n*(5+1)]='*';
					data[6][4+n*(5+1)]='*';
					data[6][4+n*(5+1)]='*';	
			}
			else if(x%10==0){
					for(int i=0;i<9;i+=8){//0的兩橫排
						for(int j=0;j<5;j++)
							data[i][j+n*(5+1)]='*';
					}
					data[2][0+n*(5+1)]='*';//0剩餘6點
					data[2][4+n*(5+1)]='*';
					data[4][0+n*(5+1)]='*';
					data[4][4+n*(5+1)]='*';
					data[6][0+n*(5+1)]='*';
					data[6][4+n*(5+1)]='*';	
			}
			x=x/10;
			n--;
		}
		
		
		for(int i=0;i<9;i++){
			for(int j=0;j<23;j++){
				System.out.print(data[i][j]);
			}
				System.out.println();
			}
		
	}//run		
	
}
