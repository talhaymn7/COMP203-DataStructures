//Question 1: Total:40 pt
	

import java.util.Arrays; 

public class TestArrays 
{ 


	public static int binarySearchRecursive(int[] arr, int target, int low, int high) { // f 7 pt
        if (low > high) {
            return -1; // Element not found
        }

        int mid = (low + high) / 2; // Calculate the middle index

        if (arr[mid] == target) {
            return mid; // Element found at index 'mid'
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, high); // Search the right half
        } else {
            return binarySearchRecursive(arr, target, low, mid - 1); // Search the left half
        }
    }


	public static void main(String[] args) 
	{ 
		//part (a)
		int[] A = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0}; //5 pts

		//part (b)
		Arrays.sort(A); //5 pts

		//part(c)
		int[] B = Arrays.copyOf(A, A.length); //5 pts

		//part (d)
		boolean result = Arrays.equals(A, B); //d 5 pts
		System.out.println("A equals B result: " + result); //d 5 pts

		//part (e)
		String str = Arrays.toString(A); //4 pts
		System.out.println(str); //1 pts

		//part (f)

		int search_result = binarySearchRecursive(A, 5, 0,9); //f 2 pts
		System.out.println("Binary search result: " + search_result); //f 1 pts
	} 
} 

