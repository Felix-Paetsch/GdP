import java.lang.Math;

public class ArmstrongNumbers {
	public static void main(String[] args) {
		int[] test = giveArmstrongNumbers(15);
		// 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634
		printArray(test);
	}

	public static int[] magic1(int a) { // Number to List of digits
        int[] b = new int[(int) Math.floor(Math.log10(a)) + 1];
        int i = 0;
        while (a > 0) {
            b[i++] = a % 10;
            a /= 10;
        }
        return b;
    }

	public static boolean isArmstrongNumber(int number) {
		if (number == 0){
			return true;
		}

		int[] splitted = magic1(number);
		int s = 0;
		for (int i = splitted.length - 1; i >= 0; i--){
			s += (int) Math.round(Math.pow(splitted[i], splitted.length));
		}
		return s == number;
	}

	public static int[] giveArmstrongNumbers(int n) {
		int found = 1;
		int[] res = new int[n];
		int c = 1;

		while (found < n){
			if (isArmstrongNumber(c)){
				res[found] = c;
				found = found + 1;
			}
			c = c + 1;
		}
		return res;
	}

	private static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print(i < a.length - 1 ? ", " : "\n");
		}
	}
}