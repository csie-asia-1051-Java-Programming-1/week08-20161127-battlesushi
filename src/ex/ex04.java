package ex;
import java.util.Scanner;
/*
 * Topic: 請用類別撰寫一個計算機，透過計算機物件可以計算 加、減、乘、除、平方、立方、開根號的功能
 * Date: 2016/11/21
 * Author: 105021030 張廷毓
 */
public class ex04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		fun cal=new fun();
		short n;
		n=cal.fun();
		if(n==1)
			cal.plus();
		else if(n==2)
			cal.minus();
		else if(n==3)
			cal.multi();
		else if(n==4)
			cal.divi();
		else if(n==5)
			cal.pow();
		else if(n==6)
			cal.cube();
		else if(n==7)
			cal.sqrt();
	}
}
class fun{
	Scanner sc=new Scanner(System.in);
	public short fun() {
		System.out.print("請輸入計算方法  1加、2減、3乘、4除、5平方、6立方、7開根號:");
		short n=sc.nextShort();
		return n;
	}
	public void plus() {
		float x=sc.nextFloat();
		float y=sc.nextFloat();
		System.out.print(x+y);
	}
	public void minus() {
		float x=sc.nextFloat();
		float y=sc.nextFloat();
		System.out.print(x-y);
	}
	public void multi() {
		float x=sc.nextFloat();
		float y=sc.nextFloat();
		System.out.print(x*y);
	}
	public void divi() {
		float x=sc.nextFloat();
		float y=sc.nextFloat();
		System.out.print(x/y);
	}
	public void pow() {
		float x=sc.nextFloat();
		System.out.print(Math.pow(x, 2));
	}
	public void cube() {
		float x=sc.nextFloat();
		System.out.print(Math.pow(x,3));
	}
	public void sqrt() {
		float x=sc.nextFloat();
		System.out.print(Math.sqrt(x));
	}
	
}