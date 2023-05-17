package ProgrammersLV0;

public class Main55 {
	// i는 105
	class Solution {
		public String solution(String myString) {
			String answer = "";
			String[] str = myString.split("");
			char[] arr = myString.toCharArray();
			for (int i = 0; i < arr.length; i++) {
				if ((int)arr[i] < 108) {
					arr[i] = 'l';
					answer += arr[i];
				} else {
					answer += arr[i];
				}
			}
			return answer;
		}
	}

}
