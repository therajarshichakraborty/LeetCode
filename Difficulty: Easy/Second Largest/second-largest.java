class Solution {
	public int getSecondLargest(int[] arr) {
		int largest = Integer.MIN_VALUE;
		int sec_largest = Integer.MIN_VALUE;
		
		for (int num:arr) {
			largest = Math.max(largest, num);
		}
		
		for (int num:arr) {
			if (num>sec_largest && num != largest) {
				sec_largest = num;
			}
		}
		if (sec_largest == Integer.MIN_VALUE) {
			return - 1;
		} else {
			return sec_largest;
		}
		
	}
}
