package dataStructure;

public class ReursiveCalls {

	public static void display(int a[], int i) {
		if (i > a.length - 1) {
			System.out.println();
			return;
		}
		System.out.print(a[i] + " ");
		display(a, i + 1);
		System.out.print(a[i] + " ");

	}

	public static int sum(int arr[], int i) {
		if (i > arr.length - 1)
			return 0;

		// System.out.println(arr[i]);
		return arr[i] + sum(arr, i + 1);
	}

	public static int count_digits(int d) {
		if (d / 10 == 0)
			return 1;

		return 1 + count_digits(d / 10);

	}

	public static int sum_digits(int d) {
		if (d / 10 == 0)
			return 1;

		return d % 10 + sum_digits(d / 10);

	}
	
	public static int power(int n, int pow)
	{
		if(pow==0)
			return 1;
		return n*power(n, pow-1);
	}
	
	public static void displayReverse(int n)
	{
		if(n/10==0) {
			System.out.println(n);
			return;
		}
			
		System.out.print(n%10);
		displayReverse(n/10);
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		display(arr, 0);
		System.out.println();
		System.out.println("Sum = " + sum(arr, 0));
		System.out.println("Count of dogits = " + count_digits(12345));
		System.out.println("Sum of dogits = " + sum_digits(12345));
		System.out.println("power = " + power(12, 1));
		displayReverse(12345);
	}

}
