package hw;
import java.util.Scanner;

/*
 * Topic: �N�e�@�D�[�j���i�H��10�H�U���U�ؼƦr�t���ഫ (�����ϥλ��j)
 * Date: 2016/11/21
Author: 105021030 �i�ʷ�
 */
public class hw02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("�п�J�n�ഫ���Ʀr,��J���X�i��,��X���X�i��:");
		System.out.print(fun(sc.nextInt(),sc.nextShort(),sc.nextShort()));
	}
	public static String fun(int x,short a,short b) {
		int count=0;
		int sum=0;
		while(x>0){//����Q�i�� -->sum
			sum=sum+(x%10)*(int)Math.pow(a,count);
			count++;
			x=x/10;
		}//sum���ഫ�Q�i��
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
