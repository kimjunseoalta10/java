import java.util.*;
public class A20230419 {
	public static void main(String[] args) {
//		System.out.println("정수 5개를 입력하세요.");
//		Scanner sc=new Scanner(System.in);
//		int i=0, max=0;
//		int num[]=new int[5];
//		while(i<5)
//		{
//			System.out.print((i+1)+"번째 정수 : ");
//			num[i]=sc.nextInt();
//			if(max<num[i])
//			{
//				max=num[i];
//			}
//			i++;
//		}
//		System.out.println("입력한 값들 중 최대값은 "+max+"입니다.");
		
		Scanner sc=new Scanner(System.in);
		int sum,i,j;
		double avg;
		int score[][]=new int[2][3];
		String name[]=new String[2];
		for(i=0; i<2; i++)
		{
			System.out.print("학생"+(i+1)+" 이름 입력 : ");
			name[i]=sc.next();
			for(j=0; j<3; j++)
			{
				System.out.print("성적"+(j+1)+" 입력 : ");
				score[i][j]=sc.nextInt();
			}
		}
		System.out.println("*****입력 완료*****");
		for(i=0; i<2; i++)
		{
			sum=0;
			for(j=0; j<3; j++)
			{
				sum+=score[i][j];
			}
			avg=sum/3.0;
			System.out.print(name[i]+"학생의 총점은 "+sum+"점이고, ");
			System.out.printf("평균은 %.2f점 입니다.\n",avg);
			if(avg>=90)
			{
				System.out.println(name[i]+"학생의 학생은 A입니다.");
			}
			else if(avg>=80)
			{
				System.out.println(name[i]+"학생의 학생은 B입니다.");
			}
			else if(avg>=70)
			{
				System.out.println(name[i]+"학생의 학생은 C입니다.");
			}
			else if(avg>=60)
			{
				System.out.println(name[i]+"학생의 학생은 D입니다.");
			}
			else
			{
				System.out.println(name[i]+"학생의 학생은 F입니다.");
			}
		}
	}

}
