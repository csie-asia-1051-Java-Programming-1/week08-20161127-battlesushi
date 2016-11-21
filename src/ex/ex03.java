package ex;
import java.util.Scanner;
/*
 * Topic:  寫一程式計算兩個矩陣的乘法，例如 A 是 n1 x m1 的矩陣， B 是 n2 x m2 的矩 陣，C=AB 為 n1 x m2 矩陣
	第一列輸入 n1, m1, n2 及 m2 等 4 個整數，n1, m1 是第一個陣列的列(row)與行 (column)，而 n2, m2 則是第二個陣列的列(row)與行(column)，其中 m2 = n2。接著輸 入兩個陣列的內容。
 * Date: 2016/11/21
 * Author: 105021030 張廷毓
 */
public class ex03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.print("輸入a的陣列數[_][_]:");
		int A[][]=new int[sc.nextInt()][sc.nextInt()];
		System.out.print("值");
		for(int i=0;i<A.length;i++){//幾列
			for(int j=0;j<A[i].length;j++){//列中幾個
				A[i][j]=sc.nextInt();
			}
		}
		System.out.print("輸入b的陣列數[_][_]:");
		int B[][]=new int[sc.nextInt()][sc.nextInt()];
		System.out.print("值");
		for(int i=0;i<B.length;i++){//幾列
			for(int j=0;j<B[i].length;j++){//列中幾個
				B[i][j]=sc.nextInt();
			}
		}
		int C[][]=new int[A.length][B[0].length];
		for(int i=0;i<A.length;i++){
			for(int j=0;j<B[0].length;j++){
				for(int k=0;k<A[i].length;k++){ //因為 n2=m2
					sum=A[i][k]*B[k][j];
				}
				C[i][j]=sum;
			}
		}
		for(int i=0;i<A.length;i++){
			for(int j=0;j<B[0].length;j++){
				System.out.print(C[i][j]);
				}
				System.out.println();
			}
		
		
		
	}
}
