import java.util.Scanner;
public class A20230412 {
	public static void main(String[] args) {
//		int i=0;
//		int max=0;
//		int num[]=new int[6];
//		System.out.println("���� 5���� �Է����ּ���.");
//		Scanner sc = new Scanner(System.in);
//		while(i<5)
//		{
//			System.out.print((i+1)+"��° ���� : ");
//			num[i] = sc.nextInt();
//			if(max<num[i])
//			{
//				max=num[i];
//			}
//			i++;
//		}
//		System.out.println("�Է��� ���� �� �ִ밪�� "+max+"�Դϴ�.");
		
//		for(int i=1; i<=4; i++)
//		{
//			for(int j=1; j<=4; j++)
//			{
//				System.out.print(j);
//			}
//			System.out.println("");
//		}
		
//		for(int i=1; i<=4; i++)
//		{
//			for(int j=1; j<=3; j++)
//			{
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<=4; i++)
//		{
//			for(int j=1; j<=i; j++)
//			{
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<=3; i++)
//		{
//			for(int j=i; j<=3; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for(int i=3; i>=1; i--)
//		{
//			for(int j=1; j<=i; j++)
//			{
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<=3; i++)
//		{
//			for(int j=3; j>=i; j--)
//			{
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		
//		System.out.print("�� �Է� : ");
//		Scanner sc=new Scanner(System.in);
//		int month = sc.nextInt();
//		int day=0;
//		switch(month)
//		{
//			case 1:
//			case 3:
//			case 5:
//			case 7:
//			case 8:
//			case 10:
//			case 12 :
//				day=31;
//				System.out.println(month+"���� "+day+"�Դϴ�.");
//				break;
//			case 4:
//			case 6:
//			case 9:
//			case 11:
//				day=30;
//				System.out.println(month+"���� "+day+"�Դϴ�.");
//				break;
//			case 2 :
//				day=28;
//				System.out.println(month+"���� "+day+"�Դϴ�.");
//				break;
//		}
		Scanner sc = new Scanner(System.in);
		String name[]=new String[2];
		int score[]=new int[3];
		int sum;
		double avg;
		
		for(int i=0; i<name.length; i++)
		{
			System.out.print("�л�" + (i+1) +" �̸� �Է� : ");
			name[i]=sc.next();
			for(int j=0; j<3; j++)
			{
				System.out.print("����"+ (j+1)+ " �Է� : ");
				score[j]=sc.nextInt();
			}
		}
		System.out.println("********�Է� �Ϸ�*********");
		for(int i=0; i<2; i++)
		{
			sum=0;
			for(int j=0; j<3; j++)
			{
				sum+=score[j];
			}
			System.out.println(name[i]+"�л��� ������"+sum+"���̰�, ");
			avg=sum/3;
			System.out.printf("����� %.2f�� �Դϴ�\n",avg);
			if(avg>=90)
				System.out.println(name[i]+"������ A�Դϴ�.");
			else if(avg>=80)
				System.out.println(name[i]+"������ B�Դϴ�.");
			else if(avg>=70)
				System.out.println(name[i]+"������ C�Դϴ�.");
			else if(avg>=60)
				System.out.println(name[i]+"������ D�Դϴ�.");
			else
				System.out.println(name[i]+"������ F�Դϴ�.");
		}
		
	}

}
