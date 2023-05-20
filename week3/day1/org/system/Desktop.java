package week3.day1.org.system;

public class Desktop extends Computer{

	
	public void desktopSize()
	{
		System.out.println("The desktop size is Medium");
	}
	public static void main(String[] args) {
		Desktop desk=new Desktop();
		desk.computerModel();
		desk.desktopSize();

	}

}
