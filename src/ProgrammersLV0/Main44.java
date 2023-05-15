package ProgrammersLV0;

public class Main44 {
	class Solution {
		public int[] solution(int[] num_list) {
			int[] answer = {};
			int[] answer2 = new int[num_list.length + 1];
			for (int i = 0; i < num_list.length; i++) {
				answer2[i] = num_list[i];
				if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
					answer2[num_list.length] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
				} else {
					answer2[num_list.length] = num_list[num_list.length - 1] * 2;
				}
			}
			return answer2;
		}
	}

}
