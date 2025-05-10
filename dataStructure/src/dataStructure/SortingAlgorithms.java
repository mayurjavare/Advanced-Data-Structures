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
			for (j = i - 1; (j >= 0)/* && (k < a[j])*/; j--) {
				if (k < a[j])
					break;
				a[j + 1] = a[j];
			}
			a[j + 1] = k;
		}
	}

	public static void merge_v2(int arr[], int res[], int low1, int high1, int low2, int high2) {
//		System.out.println("in V2");
		int i, j, tar;
		i = low1;
		j = low2;
		tar = low1;
		while ((i <= high1) && (j <= high2)) {
			if (arr[i] < arr[j]) {
				res[tar] = arr[i];
				tar++;
				i++;
			} else if (arr[j] < arr[i]) {
				res[tar] = arr[j];
				tar++;
				j++;
			} else {
				res[tar] = arr[i];
				tar++;
				i++;
				j++;
			}
		}
		while (i <= high1) {
			res[tar] = arr[i];
			tar++;
			i++;
		}
		while (j <= high2) {
			res[tar] = arr[j];
			tar++;
			j++;
		}

	}

	public static void copy(int[] arr, int[] temp, int low, int high) {
//		System.out.println("in copy");
		int i = low;
		while (i <= high) {
			arr[i] = temp[i];
			i++;
		}
	}
	
	public static void merge_sort(int arr[], int low, int high)
	{
		int mid;
		int temp[] = new int[50];
		
		if(low<high)
		{
//			System.out.println("in if of rec");
			mid = (low+high)/2;
			merge_sort(arr, low, mid);
			merge_sort(arr, mid+1, high);
			
			merge_v2(arr, temp, low, mid, mid+1, high);
			
			
			copy(arr, temp, low, high);
			
		}
	}

	public static void main(String[] args) {

		int arr[] = { 55, 22, 66, 77, 44, 10, 34, 51, 67 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
//		bubbleSort(arr);
//		selectionSort(arr);
//		insertionSort(arr);
		merge_sort(arr, 0, 8);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}
}
