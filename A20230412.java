import java.util.Scanner;
public class A20230412 {
	public static void main(String[] args) {
//		int i=0;
//		int max=0;
//		int num[]=new int[6];
//		System.out.println("정수 5개를 입력해주세요.");
//		Scanner sc = new Scanner(System.in);
//		while(i<5)
//		{
//			System.out.print((i+1)+"번째 정수 : ");
//			num[i] = sc.nextInt();
//			if(max<num[i])
//			{
//				max=num[i];
//			}
//			i++;
//		}
//		System.out.println("입력한 값들 중 최대값은 "+max+"입니다.");
		
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
		
//		System.out.print("달 입력 : ");
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
//				System.out.println(month+"월은 "+day+"입니다.");
//				break;
//			case 4:
//			case 6:
//			case 9:
//			case 11:
//				day=30;
//				System.out.println(month+"월은 "+day+"입니다.");
//				break;
//			case 2 :
//				day=28;
//				System.out.println(month+"월은 "+day+"입니다.");
//				break;
//		}
		Scanner sc = new Scanner(System.in);
		String name[]=new String[2];
		int score[]=new int[3];
		int sum;
		double avg;
		
		for(int i=0; i<name.length; i++)
		{
			System.out.print("학생" + (i+1) +" 이름 입력 : ");
			name[i]=sc.next();
			for(int j=0; j<3; j++)
			{
				System.out.print("성적"+ (j+1)+ " 입력 : ");
				score[j]=sc.nextInt();
			}
		}
		System.out.println("********입력 완료*********");
		for(int i=0; i<2; i++)
		{
			sum=0;
			for(int j=0; j<3; j++)
			{
				sum+=score[j];
			}
			System.out.println(name[i]+"학생의 총점은"+sum+"점이고, ");
			avg=sum/3;
			System.out.printf("평균은 %.2f점 입니다\n",avg);
			if(avg>=90)
				System.out.println(name[i]+"학점은 A입니다.");
			else if(avg>=80)
				System.out.println(name[i]+"학점은 B입니다.");
			else if(avg>=70)
				System.out.println(name[i]+"학점은 C입니다.");
			else if(avg>=60)
				System.out.println(name[i]+"학점은 D입니다.");
			else
				System.out.println(name[i]+"학점은 F입니다.");
		}
		
	}

}
