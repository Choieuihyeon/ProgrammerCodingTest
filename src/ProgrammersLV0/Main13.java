package ProgrammersLV0;

import java.util.Arrays;

public class Main13 {
	class Solution {
		public int solution(String message) {
			int answer = 0;
			int cnt = 0;
			long str = Arrays.stream(message.split("")).count();

			return (int)str * 2;
		}
	}
}
