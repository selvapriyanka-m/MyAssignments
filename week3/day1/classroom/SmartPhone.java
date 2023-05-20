package week3.day1.classroom;

public class SmartPhone extends AndroidPhone {
	public void takeVideo() {
		System.out.println("The video is taken by Smart phone");

	}
public static void main(String[] args) {
	SmartPhone smart= new SmartPhone();
	smart.takeVideo();
}
}
