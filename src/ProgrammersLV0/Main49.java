package ProgrammersLV0;

import java.util.ArrayList;
import java.util.List;

public class Main49 {
	class Solution {
		public List solution(int[] arr) {
			int[] answer = {};
			ArrayList<Integer> list = new ArrayList<>();
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i]; j++) {
					list.add(arr[i]);
				}
			}
			return list;
		}
	}

}
