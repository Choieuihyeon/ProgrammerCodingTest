package ProgrammersLV0;

import java.util.ArrayList;
import java.util.Arrays;

public class Main50 {
		class Solution {
			public String[] solution(String my_string) {
				ArrayList<String> list = new ArrayList<>();
				String[] str = my_string.split(" ");
				for (int i = 0; i < str.length; i++) {
					if (!str[i].equals(" ")) {
						list.add(str[i]);
					}
				}
				String[] answer = new String[list.size()];
				for (int i = 0; i < list.size(); i++) {
					answer[i] = list.get(i);
				}
				return answer;
			}
		}
	}

