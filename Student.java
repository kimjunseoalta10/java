
public class Student extends Person{
	boolean online;
	public void printInfo() {
		super.printInfo();
		if(online==true)
			System.out.println(name+"�� �л��̸� ���� �¶��� ���� ���Դϴ�.");
		else
			System.out.println(name+"�� �л��̸� ���� � ���� ���Դϴ�.");
	}

}
