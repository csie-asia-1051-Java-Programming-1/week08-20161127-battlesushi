package hw;
import java.util.Scanner;
/*
 * Topic: �мg�@�� ���j�禡	�i��Q�i��Ʀr�ഫ���G�i��Ʀr�A�Ҧp�Q�i� 13 �|��X�G�i� 1101
 * Date: 2016/11/21
 * Author: 105021030 �i�ʷ�
 */
public class hw01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("�п�J�Q�i��Ʀr:");
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
