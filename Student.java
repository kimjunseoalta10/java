
public class Student {
//	String name;
//	int grade;
//	static int count = 0;
//	public Student() {
//		count++;
//	}
	
//	String name ;
//	int grade ;
//	static int count = 0;
//	public Student() {
//		count++;
//	}
//	public static int getCount() {
//		return count;
//	}
	
	private String name ;
	private int grade ;
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int g) {
		grade = g;
	}
	
	public void print() {
		System.out.println("�л��� �̸��� "+name+"�̰�"+grade+"�г��Դϴ�.");
	}
	

}
