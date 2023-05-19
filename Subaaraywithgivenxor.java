public class Solution {
    public int solve(int[] A, int B) {
        int n = A.length;
		int ans = 0;
		int prefixXor = 0;
		HashMap<Integer, Integer> countOfPrefixXor = new HashMap<Integer, Integer> ();
		for (int i = 0; i < n; i++) {
			prefixXor ^= A[i];
			if (prefixXor == B) {
				ans++;
			}
			if (countOfPrefixXor.get(prefixXor ^ B) != null) {
				ans += countOfPrefixXor.get(prefixXor ^ B);
			}
			if (countOfPrefixXor.get(prefixXor) != null) {
                countOfPrefixXor.put(prefixXor, countOfPrefixXor.get(prefixXor) + 1);
			} else {
                countOfPrefixXor.put(prefixXor, 1);
			}
		}
		return ans;
	}
}
