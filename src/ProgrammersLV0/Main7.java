package ProgrammersLV0;

public class Main7 {
	class Solution {
		public int solution(int[] num_list) {
			int answer = 0;
			int answer2 = 1;
			for (int i = 0; i < num_list.length; i++) {
				if (num_list.length >= 11) {
					answer += num_list[i];
				} else {
					answer2 *= num_list[i];
				}
			}
			if (num_list.length >= 11) {
				return answer;
			} else {
				return answer2;
			}
		}
	}

}
