
public class StudentExam {
	public static void main(String[] args) {
		Student kim = new Student();
		kim.setName("������");
		kim.setGrade(2);
		Student jang = new Student();
		jang.setName("�����");
		jang.setGrade(3);
		//System.out.println("�л��� �̸��� "+kim.getName()+"�̰� "+kim.getGrade()+"�г��Դϴ�.");
		//System.out.println("�л��� �̸��� "+jang.getName()+"�̰� "+jang.getGrade()+"�г��Դϴ�.");
		
		//print(kim);
		//print(jang);
		kim.print();
		jang.print();
	}

}
