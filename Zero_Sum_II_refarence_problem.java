/*

Given an integer array, find all contiguous subarrays with zero-sum.

Input : [4, 2, -3, -1, 0, 4]
Output: {[-3, -1, 0, 4], [0]}

Input : [3, 4, -7, 3, 1, 3, 1, -4, -2, -2]
Output: {[3, 4, -7], [4, -7, 3], [-7, 3, 1, 3], [3, 1, -4], [3, 1, 3, 1, -4, -2, -2], [3, 4, -7, 3, 1, 3, 1, -4, -2, -2]}

Input : [0, 0]
Output: {[0], [0, 0]}

Input : [1, 2, 3]
Output: {}

Note: Since an input can have multiple subarrays with zero-sum, the solution should return a set containing all the distinct subarrays.

*/

class Solution
{
	public static Set<List<Integer>> getAllZeroSumSubarrays(List<Integer> nums)
	{
		Set<List<Integer>> subarrays = new HashSet<>();

		// Write your code here...
		Integer[] ary = nums.stream().toArray(Integer[]::new);
		List<Integer> list;
		// int num = 0;
		for(int i = 0; i < ary.length; i++){
			// listを新規で生成
			list = new LinkedList<>();
			// listにary[i]を追加
			list.add(ary[i]);
			// listの合計が0ならsubarraysに追加
			if(list.stream().reduce((r, n) -> r += n).orElse(1) == 0)
				subarrays.add(new LinkedList<Integer>(list));
			// i + 1 からary.lengthまでループ
			for(int j = i + 1; j < ary.length; j++){
				// listにary[j]を追加
				list.add(ary[j]);
				// listの合計が0ならsubarraysに追加
				if(list.stream().reduce((r, n) -> r += n).orElse(0) == 0)
					subarrays.add(new LinkedList<Integer>(list));
			}
		}

		return subarrays;
	}
}
