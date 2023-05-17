package ProgrammersLV0;

import java.util.ArrayList;

public class Main56 {
	class Solution {
		public ArrayList solution(String[] names) {
			String[] answer = {};
			ArrayList list = new ArrayList();
			for (int i = 0; i < names.length; i++) {
				if (i % 5 == 0) {
					list.add(names[i]);
				}
			}
			return list;
		}
	}

}
