package dataStructure;

public class SortingAlgorithms {

	public static void bubbleSort(int[] a) {
		int i, j, temp, flag;
		for (i = a.length - 1; i >= 0; i--) {
			flag = 0;
			for (j = 0; j < i; j++) {
				if (a[j] > a[j + 1]) {
					flag++;
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			if (flag == 0)
				break;
		}
	}

	public static void selectionSort(int a[]) {
		int i, j, min, temp;
		for (i = 0; i < a.length; i++) {
			min = i;
			for (j = i + 1; j < a.length - 1; j++) {
				if (a[j] < a[min])
					min = j;
			}
			if (min != i) {
				temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}
	}

	public static void insertionSort(int a[]) {
		int i, j, k;
		for (i = 1; i < a.length; i++) {
			k = a[i];
			for (j = i - 1; (j >= 0) && (k < a[j]); j--) {
//				if (k < a[j])
//					break;
				a[j + 1] = a[j];
			}
			a[j + 1] = k;
		}
	}

	public static void main(String[] args) {

		int arr[] = { 55, 22, 66, 77, 44, 10, 34, 51, 66 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
//		bubbleSort(arr);
//		selectionSort(arr);
		insertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}
}
