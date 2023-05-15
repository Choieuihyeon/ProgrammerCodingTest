package ProgrammersLV0;

public class Main43 {
	class Solution {
		public int solution(int a, int b) {
			int answer = 0;
			String answer1 = Integer.toString(a) + Integer.toString(b);
			String answer2 = Integer.toString(b) + Integer.toString(a);
			answer = Math.max(Integer.parseInt(answer1), Integer.parseInt(answer2));
			return answer;
		}
	}

}
