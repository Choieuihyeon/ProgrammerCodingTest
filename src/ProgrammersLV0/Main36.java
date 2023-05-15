package ProgrammersLV0;

import java.util.ArrayList;
import java.util.Arrays;

public class Main36 {
	class Solution {
		public ArrayList solution(int[] num_list) {
			int[] answer = {};
			ArrayList list = new ArrayList();
			Arrays.sort(num_list);
			for (int i = 0; i < 5; i++) {
				list.add(num_list[i]);
			}
			return list;
		}
	}
}
