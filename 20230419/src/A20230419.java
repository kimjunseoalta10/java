import java.util.*;
public class A20230419 {
	public static void main(String[] args) {
//		System.out.println("���� 5���� �Է��ϼ���.");
//		Scanner sc=new Scanner(System.in);
//		int i=0, max=0;
//		int num[]=new int[5];
//		while(i<5)
//		{
//			System.out.print((i+1)+"��° ���� : ");
//			num[i]=sc.nextInt();
//			if(max<num[i])
//			{
//				max=num[i];
//			}
//			i++;
//		}
//		System.out.println("�Է��� ���� �� �ִ밪�� "+max+"�Դϴ�.");
		
		Scanner sc=new Scanner(System.in);
		int sum,i,j;
		double avg;
		int score[][]=new int[2][3];
		String name[]=new String[2];
		for(i=0; i<2; i++)
		{
			System.out.print("�л�"+(i+1)+" �̸� �Է� : ");
			name[i]=sc.next();
			for(j=0; j<3; j++)
			{
				System.out.print("����"+(j+1)+" �Է� : ");
				score[i][j]=sc.nextInt();
			}
		}
		System.out.println("*****�Է� �Ϸ�*****");
		for(i=0; i<2; i++)
		{
			sum=0;
			for(j=0; j<3; j++)
			{
				sum+=score[i][j];
			}
			avg=sum/3.0;
			System.out.print(name[i]+"�л��� ������ "+sum+"���̰�, ");
			System.out.printf("����� %.2f�� �Դϴ�.\n",avg);
			if(avg>=90)
			{
				System.out.println(name[i]+"�л��� �л��� A�Դϴ�.");
			}
			else if(avg>=80)
			{
				System.out.println(name[i]+"�л��� �л��� B�Դϴ�.");
			}
			else if(avg>=70)
			{
				System.out.println(name[i]+"�л��� �л��� C�Դϴ�.");
			}
			else if(avg>=60)
			{
				System.out.println(name[i]+"�л��� �л��� D�Դϴ�.");
			}
			else
			{
				System.out.println(name[i]+"�л��� �л��� F�Դϴ�.");
			}
		}
	}

}
