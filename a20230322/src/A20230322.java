import java.util.*;
public class A20230322 {
	public static void main(String[] args) {
		//int[] a=new int[3];
		//a[0] = 10; a[1] = 20 ; a[2] = 30;
		//System.out.println(a.length);
		
		//int[] a= new int[] {1,2,3,4,5,6,7,8,9,10};
		//for(int i=0; i<a.length; i++)
				//System.out.println("a["+i+"]="+a[i]);
		
		//int[] a = new int[];
		
		int a[][]=new int [2][3];
		a[0][0] = 1; a[0][1] = 2; a[0][2] = 3;
		a[1][0] = 10; a[1][1] = 20; a[1][2] = 30;
		for(int i = 0; i<a.length; i++)
			for(int j =0; j<a[i].length; j++)
				System.out.print(a[i][j] + "\t");
	}
}
