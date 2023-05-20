package week3.day1;

public class AxisBank extends BankInfo {

	public void deposit(int amount) {
		System.out.println("Your minimum deposit amount in Axis bank is "+amount);

	}
	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.deposit(500);

	}

}
