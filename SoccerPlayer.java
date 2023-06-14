
public class SoccerPlayer extends Person{
	String teamName;
	public void printInfo() {
		super.printInfo();
		System.out.println(name+"는 "+teamName+"팀 축구선수입니다.");
	}

}
