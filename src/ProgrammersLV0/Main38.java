package ProgrammersLV0;

public class Main38 {
	class Solution {
		public String solution(String my_string, String alp) {
			String answer = "";
			String[] str = my_string.split("");
			for (int i = 0; i < str.length; i++) {
				if (str[i] == alp) {
					answer += str[i].toUpperCase();
				} else {
					answer += str[i];
				}
			}
			return answer;
		}
	}
}
