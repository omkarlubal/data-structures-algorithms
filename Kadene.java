/**
Solves Largest Sum Contiguous Subarray problem.
For more info: https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
*/
import java.util.*;

class Kadene {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[] {-2, -3, 4, -1, -2, 1, 5, -3};
		int n = a.length;
		
		int maxSoFar = a[0];
		int currMax = a[0];
		
		for (int i = 1; i < n; i++ ) {
			currMax = Math.max(a[i], currMax + a[i]);
			maxSoFar = Math.max(maxSoFar, currMax);
		}
		
		printLn(maxSoFar);
	}
	
	private static void printLn(Object obj) {
		System.out.println(obj.toString());
	}
}

/*
0    1  2   3   4  5  6   7
-2, -3, 4, -1, -2, 1, 5, -3
maxSoFar = -2
currMax = -2

i = 1
currMax = -3
maxSoFar = -2

i = 2
currMax = 4
maxSoFar = 4

i = 3
currMax = 3
maxSoFar = 4

i = 4
currMax = 1
maxSoFar = 4

i = 5
currMax = 2
maxSoFar = 4

i = 6
currMax = 7
maxSoFar = 7

i = 7
currMax = 4
maxSoFar = 7
*/