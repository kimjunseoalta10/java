
public class Cartoon extends Boook{
	boolean webtoon;
	public void printBoook() {
		super.printBoook();
		if(webtoon==true)
			System.out.println("�� ��ȭ�� �����Դϴ�");
		else
			System.out.println("�� ��ȭ�� ������ �ƴմϴ�");
	}

}
