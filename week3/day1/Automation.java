package week3.day1;

public class Automation extends MultipleLangauge implements Language, TestTool {

	public void selenium() {
		System.out.println("The Test tool is Selenium");
		
	}

	public void java() {
		System.out.println("The language is Java");
		
	}

	@Override
	public void ruby() {
		System.out.println("The first multiple lanugaue is Ruby");
		
	}
	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.java();
		auto.selenium();
		auto.python();
		auto.ruby();

	}

}
