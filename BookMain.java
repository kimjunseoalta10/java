
public class BookMain {
	public static void main(String[] args) {
		System.out.println(Book.getLibrary()+"�� ���� ������ "+Book.getBookCnt() + "�� �Դϴ�");
		Book a1 = new Book();
		a1.setNo(101);
		a1.setName("������");
		a1.setCount(10);
		Book a2 = new Book(102, "���� ������");
		a2.setCount(5);
		Book a3 = new Book(103, "��������", 15);
		
		a1.printInfo();
		a2.printInfo();
		a3.printInfo();
		
		System.out.println(Book.getLibrary()+"�� ���� ������ "+Book.getBookCnt() + "�� �Դϴ�");
		
		a1.borrowBook(15);
		a2.returnBook(2);
		a1.borrowBook(5);
		a3.borrowBook(10);
		a3.returnBook(5);
		
		a1.printInfo();
		a2.printInfo();
		a3.printInfo();
	}

}
