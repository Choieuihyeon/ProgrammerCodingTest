package ProgrammersLV0;

public class Main41 {
	class Solution {
		public String solution(String my_string, String alp) {
			String answer = "";
			StringBuilder sb = new StringBuilder();
			String[] str = my_string.split("");
			for (int i = 0; i < str.length; i++) {
				if (str[i].equals(alp)) {
					sb.append(alp.toUpperCase());
				} else {
					sb.append(str[i]);
				}
				answer = sb.toString();
			}
			return answer;
		}
	}

}
