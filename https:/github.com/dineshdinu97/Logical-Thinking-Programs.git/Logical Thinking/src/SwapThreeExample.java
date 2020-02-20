
public class SwapThreeExample {
//part 1
	public static void main(String[] args) {
		// Java program to swap three variables
		// without using temporary variable.

		SwapThreeExample obj = new SwapThreeExample();
		obj.swapThree();
		

	}

	private void swapThree() {
		int a = 5;// 10
		int b = 10;// 5

		a = a + b;// 5+10=15
		b = a - b;// 15-10=5
		a = a - b;// 15-5=10

		System.out.println(a);// 10
		System.out.println(b);// 5
	}

}
