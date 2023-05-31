
public class Sun extends Father{
	public Sun(String str) {
		super(str);
		System.out.println("Sun 생성자");
	}
	public static void main(String[] args) {
		Sun s = new Sun("홍길동");
	}
}
