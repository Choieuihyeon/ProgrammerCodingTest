package ProgrammersLV0;

import java.util.Arrays;

public class Main10 {
	class Solution {
		public int solution(String num_str) {
			int answer = 0;
			String[] str = num_str.split("");
			for (int i = 0; i < str.length; i++) {
				answer += Integer.parseInt(str[i]);
			}
			return answer;
		}
	}

}
