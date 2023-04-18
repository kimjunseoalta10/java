import java.util.*;
public class 시험연습 {
    public static void main(String[] args) {
        // int num[]=new int[5];
        // int i;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("정수 5개를 입력해주세요.");
        // for(i=0; i<5; i++)
        // {
        //     System.out.print((i+1)+"번째 정수 : ");
        //     num[i] = sc.nextInt();
        // }
        // int max=0;
        // for(i=0; i<5; i++)
        // {
        //     if(num[i]>max)
        //     {
        //         max=num[i];
        //     }
        // }
        // System.out.println("입력한 값들 중 최대값은 "+max+"입니다.");

        // for(int i=1; i<=3; i++)
        // {
        //     for(int j=1; j<=4; j++)
        //     {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=4; i++)
        // {
        //     for(int j=1; j<=3; j++)
        //     {
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=4; i++)
        // {
        //     for(int j=1; j<=i; j++)
        //     {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=3; i++)
        // {
        //     for(int j=i; j<=3; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=3; i++)
        // {
        //     for(int j=1; j<=4-i; j++)
        //     {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // for(int i=1; i<=3; i++)
        // {
        //     for(int j=1; j<=4-i; j++)
        //     {
        //         System.out.print(i);
        //     }
        //     System.out.println();
        // }

        // System.out.print("달 입력 : ");
        // Scanner sc = new Scanner(System.in);
        // int month, day;
        // month=sc.nextInt();
        // switch(month)
        // {
        //     case 1 :
        //     case 3 :
        //     case 5 :
        //     case 7 :
        //     case 8 :
        //     case 10 :
        //     case 12 :
        //         day=31;
        //         break;
        //     case 4 :
        //     case 6 :
        //     case 9 :
        //     case 11 :
        //         day=30;
        //         break;
        //     default :
        //         day=28;
        //         break;
        // }
        // System.out.println(month+"월은 "+day+"입니다.");

        // System.out.print("숫자 입력 : ");
        // Scanner sc = new Scanner(System.in);
        // int num=sc.nextInt();
        // int sum=0;
        // for(int i=1; i<=num; i++)
        // {
        //     if(i%2==0)
        //     {
        //         sum-=i;
        //     }
        //     else
        //     {
        //         sum+=i;
        //     }
        // }
        // for(int i=1; i<=num; i++)
        // {
        //     if(i%2==0)
        //     {
        //         System.out.print("-"+i);
        //     }
        //     else
        //     {
        //         System.out.print("+"+i);
        //     }
        // }
        // System.out.print("="+sum);

        // int num1=3;
        // int num2=7;
        // if(++num1<5|++num2>8)
        //     System.out.println(num1);

        // System.out.println(num2);

        // int num1=3;
        // int num2=7;
        // if(++num1<5||++num2>8)
        //     System.out.println(num1);

        // System.out.println(num2);

        // for(int i=1; i<=10; i++)
        // {
        //     if(i%2==1)
        //     {
        //         System.out.print(i+" ");
        //     }
        // }

        Scanner sc=new Scanner(System.in);
        String[] name =new String[2];
        int[][] score = new int[2][3];
        int sum;
        double avg;
        for(int i=0; i<2; i++)
        {
            System.out.print("학생"+(i+1)+" 이름 입력 : ");
            name[i] = sc.next();
            for(int j=0; j<3; j++)
            {
                System.out.print("성적"+(j+1)+" 입력 : ");
                score[i][j] = sc.nextInt();
            }
        }
        System.out.println("****입력 완료****");
        for(int i=0; i<2; i++)
        {
            sum=0;
            for(int j=0; j<3; j++)
            {
                sum+=score[i][j];
            }
            System.out.print(name[i]+"학생의 총점은 "+ sum+"점이고, ");
            avg=sum/3.0;
            System.out.printf("평균은 %.2f점 입니다.\n",avg);
            if(sum>=90)
            {
                System.out.println(name[i]+"학생의 학점은 A입니다.");
            }
            else if(sum>=80)
            {
                System.out.println(name[i]+"학생의 학점은 B입니다.");
            }
            else if(sum>=70)
            {
                System.out.println(name[i]+"학생의 학점은 C입니다.");
            }
            else if(sum>=60)
            {
                System.out.println(name[i]+"학생의 학점은 D입니다.");
            }
            else
            {
                System.out.println(name[i]+"학생의 학점은 F입니다.");
            }
        }
    }
}