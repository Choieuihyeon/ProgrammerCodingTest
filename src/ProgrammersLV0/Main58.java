package ProgrammersLV0;

public class Main58 {
	class Solution {
		public int solution(String binomial) {

			String[] str = binomial.split(" ");
			int answer = Integer.parseInt(str[0]);

			for (int i = 1; i < str.length; i+=2) {
				if (str[i].equals("+")) {
					answer += Integer.parseInt(str[i + 1]);
				} else if (str[i].equals("-")) {
					answer -= Integer.parseInt(str[i + 1]);
				} else {
					answer *= Integer.parseInt(str[i + 1]);
				}
			}
			return answer;
		}
	}

}
