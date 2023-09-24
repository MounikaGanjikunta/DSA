/*Code Ninjas */

public class Solution {
	public static int countOccurrences(int[] arr, int x) {
		// Write your code here.
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			if( x == arr[i]){
				count++;
			}
		}
		return count;
	}
}
