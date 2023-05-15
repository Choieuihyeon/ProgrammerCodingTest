package ProgrammersLV0;

import java.util.ArrayList;

public class Main45 {
	class Solution {
		public int solution(int n) {
			int answer = 0;
			ArrayList<Integer> list = new ArrayList();
			for (int i = 1; i <= n; i++) {
				if (n % 2 == 1) {
					list.add(i);
				} else {
					list.add((int) Math.pow(i, 2));
				}
			}
			for (int i = 0; i < list.size(); i++) {
				if (n % 2 == 1) {
					answer += list.get(i);
				} else {
					answer += list.get(i);
				}
			}
			return answer;
		}
	}
}
