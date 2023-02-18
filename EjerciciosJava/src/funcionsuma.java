
public class funcionsuma {
	public static int sumThreeNumbers(int num1, int num2, int num3) {
	    int sum = num1 + num2 + num3;
	    return sum;
	}
	public static void main(String[] args) {
	    int num1 = 2;
	    int num2 = 3;
	    int num3 = 5;
	    int result = sumThreeNumbers(num1, num2, num3);
	    System.out.println("La suma de los tres números es: " + result);
	}
}
