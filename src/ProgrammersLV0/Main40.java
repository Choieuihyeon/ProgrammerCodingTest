package ProgrammersLV0;

public class Main40 {
	class Solution {
		public String[] solution(String[] strArr) {
			String[] answer = {};
			for (int i = 0; i < strArr.length; i++) {
				if (i % 2 == 0) {
					strArr[i] = strArr[i].toLowerCase();
				} else {
					strArr[i] = strArr[i].toUpperCase();
				}
			}
			return strArr;
		}
	}

}