
public class Book {
	private int no;
	private String name;
	private int count;
	private int borrow;
	private final static String Library = "�κ�������";
	private static int bookCnt=0;
	
	public Book() {
		bookCnt++;
	}
	public Book(int no, String name) {
		this();
		this.no = no ;
		this.name = name;
	}
	public Book(int no, String name, int count) {
		this(no,name);
		this.count = count;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public static int getBookCnt() {
		return bookCnt;
	}
	public static void setBookCnt(int bookCnt) {
		bookCnt = bookCnt;
	}
	public static String getLibrary() {
		return Library;
	}
	public void printInfo() {
		System.out.println("��ȣ:"+no+" ������:"+name+" ��������:"+count+" �뿩����:"+ borrow);
	}
	public static String getLibrary() {
		return Library;
	}
	public void borrowBook(int cnt) {
		if(cnt>count) {
			System.out.println(no+"�� ���� "+cnt+"�� ���� ����");
		}
		else {
			System.out.println(no+"�� ���� "+cnt+"�� ���� ����");
			count=count-cnt;
			borrow = borrow + cnt;
		}
	}
	public void returnBook(int cnt) {
		if(borrow<cnt) {
			System.out.println(no+"�� ���� "+cnt+"�� �뿩 ����");
		}
		else {
			System.out.println(no+"�� ���� "+cnt+"�� �뿩 ����");
			count=count+cnt;
			borrow = borrow - cnt;
		}
	}

}
