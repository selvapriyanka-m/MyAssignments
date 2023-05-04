package javachallenge;

public class SquareRoot {

	public static void main(String[] args) {
		 int nonNegativeNnumber= 144;
		 int squareRootValue=0;
         int temp;
         squareRootValue=nonNegativeNnumber/2;
         do {
     		temp = squareRootValue;
     		squareRootValue = (temp + (nonNegativeNnumber / temp)) / 2;
     	} while ((temp - squareRootValue) != 0);
         System.out.println(squareRootValue);
	}

}
