package ProgrammersLV0;

import java.util.Arrays;

public class Main30 {
	class Solution {
		public int[] solution(int[] num_list) {
			int[] answer = {};
			Arrays.sort(num_list);
			return Arrays.copyOfRange(num_list, 5, num_list.length);
		}
	}

}
