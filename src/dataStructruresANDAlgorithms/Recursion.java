package dataStructruresANDAlgorithms;

public class Recursion {

	public static void main(String[] args) {
		System.out.println("Hello, Ryan!");
		powerOfTwoIT(8);
		powerOfTwo(2);
		factorials(4);
		sum(10);
		powersOf2(50);

	}

	static void log(int[] numbers) {
		// 0(1) Constant time "The size of this input doesn't matter,
		// this method will always run in Constant Time O(1)".
		System.out.println(numbers[0]);
	}

	static void log2(int[] numbers2) {
		// 0(1) Constant time "The size of this input doesn't matter,
		// this method will always run in Constant Time O(1)".
		System.out.println(numbers2[0]);
		System.out.println(numbers2[0]);
	};

	// Recursive: a way to solve a problem with a function that calls itself.
	static int powerOfTwo(int n) {
		if (n == 0) {
			return 1;
		} else {
			System.out.println("This is the value of n: " + n);
			var power = 2 * powerOfTwo(n - 1);
			System.out.println("The recursive function is called: " + power);
			return power;
		}
	}

	// Iterative
	static int powerOfTwoIT(int n) {
		var i = 0;
		var power = 1;
		while (i < n) {
			power = power * 2;
			i++;
		}
		System.out.println("This is the iterative function: " + power);
		return power;
	}

	// Factorial only use positive integers, 0! && 1! = 1, else recursive call n! =
	// n*(n-1)!
	static int factorials(int n) {
		if (n < 1) {
			return -1;
		}
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorials(n - 1);
	}

	static int sum(int n) {
		if (n <= 0) {
			return 0;
		}
		System.out.println(n);
		return n + sum(n - 1);
	}
	
	static int powersOf2(int n) {
		if(n < 1) {
			return 0;
		} else if(n==1) {
			return 1;
		} else {
			var prev = powersOf2(n/2);
			var curr = prev*2;
			System.out.println(curr);
			return curr;
		}
	}

}
