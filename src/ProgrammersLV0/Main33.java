package ProgrammersLV0;

public class Main33 {
	class Solution {
		public StringBuilder solution(String my_string, int[] index_list) {
			String answer = "";
			char[] arr = my_string.toCharArray();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < index_list.length; i++) {
				sb.append(arr[index_list[i]]);
			}
			return sb;
		}
	}
}
