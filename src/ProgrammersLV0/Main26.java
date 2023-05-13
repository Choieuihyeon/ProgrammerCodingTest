package ProgrammersLV0;

public class Main26 {
	class Solution {

		public int solution(int[] num_list) {
			int answer = 1;
			int answer2 = 0;
			for (int i = 0; i < num_list.length; i++) {
				answer *= num_list[i];
				answer2 += num_list[i];
				if (answer > Math.pow(answer2, 2)) {
					return 0;
				}
			}
			return 1;
		}
	}
}
