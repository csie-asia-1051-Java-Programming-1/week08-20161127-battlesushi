package hw;
import java.util.Scanner;
/*
 * Topic:�мg�@�ӻ��j�{���A��J�@�� int ���A����ơA
 * �æ^�ǸӸ�Ʀb�G�i��U���h�֭Ӧ줸�O 1�A�Ҧp: ��J 13 �o�쵲�G�� 3
 * Date: 2016/11/21
 * Author: 105021030 �i�ʷ�
 */
public class hw03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("��J�Ʀr, ���ƪ��i�:");
		System.out.print(fun(sc.nextInt(),sc.nextShort()));
	}
	public static int fun(int x,short a) {
		int count=0;
		int sum=0;
		while(x>0){//����Q�i�� -->sum
			sum=sum+(x%10)*(int)Math.pow(a,count);
			count++;
			x=x/10;
		}//sum���ഫ�Q�i��
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
