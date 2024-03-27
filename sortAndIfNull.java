/*

Given an integer array, find the maximum length contiguous subarray having a given sum.

Input : nums[] = [5, 6, -5, 5, 3, 5, 3, -2, 0], target = 8
Output: [-5, 5, 3, 5]
Explanation: The subarrays with sum 8 are [[-5, 5, 3, 5], [3, 5], [5, 3]]. The longest subarray is [-5, 5, 3, 5] having length 4.

Note: Since an input can contain several maximum length subarrays with given sum, the solution should return any one of the maximum length subarray.

*/

class Solution
{
	public static List<Integer> findMaxLenSubarray(List<Integer> nums, int target)
	{
		// Write your code here...
		// numsの中から合計=targetとなるlistのlist(=List<List<Integer>>)を作る
		List<List<Integer>> listList = new LinkedList<>();
		List<Integer> list;
		for(int i = 0; i < nums.size(); i++){
			list = new LinkedList<>();
			list.add(nums.get(i));
			if(list.stream().reduce((r, n) -> r + n).get() == target)
				listList.add(new LinkedList<Integer>(list));
			for(int j = i + 1; j < nums.size(); j++){
				list.add(nums.get(j));
				if(list.stream().reduce((r, n) -> r + n).get() == target)
					listList.add(new LinkedList<Integer>(list));
			}
		}

		// listListの中でlist#size()が最大のlistを返す
		// listListをstream化して、sizeが大きい順にsortして、最初の要素を取得。
		// 当てはまる要素が無い場合は、Optional#orElse()にてCollections.emptyList()を使って空のリストを返す。

		return listList
				.stream()
				.sorted((s1, s2) -> s2.size() - s1.size())
				.findFirst()
				.orElse(Collections.emptyList());
	}
}
