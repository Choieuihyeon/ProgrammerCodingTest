package ProgrammersLV0;

public class Main34 {
	class Solution {
		public int solution(int[] num_list) {
			int answer = 0;
			StringBuilder sb1 = new StringBuilder();
			StringBuilder sb2 = new StringBuilder();
			int answer1 = 0;
			int answer2 = 0;
			for (int i = 0; i < num_list.length; i++) {
				if (num_list[i] % 2 == 0) {
					sb1.append(num_list[i]);
				} else {
					sb2.append(num_list[i]);
				}
			}
			answer1 = Integer.parseInt(sb1.toString());
			answer2 = Integer.parseInt(sb2.toString());
			return Integer.parseInt(String.valueOf(answer1 + answer2));
		}
	}

}
