
public class Cartoon extends Boook{
	boolean webtoon;
	public void printBoook() {
		super.printBoook();
		if(webtoon==true)
			System.out.println("이 만화는 웹툰입니다");
		else
			System.out.println("이 만화는 웹툰이 아닙니다");
	}

}
