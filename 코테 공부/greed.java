import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class greed {

	public static void main(String[] args) {
		// System.out.println();
		String[] a = { "abcabcdede", "sad" };
		// int[] b = {1,2};
		// int[] b = IntStream.rangeClosed(2,51).boxed().mapToInt(i->i).toArray();
		int[] b = {  2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5 };
//		int[] b = { 1, 2, 3, 4};
//		int[] b = { 5, 4, 1, 3, 2 };
		// int[] d = {2,2,7,8};
		int[][] d = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		String s = "aaaaaa";
		int n = 25;
		int m = 5;
		int[] c = {  2, 4 };
		int[] e = {  3 };
		
		
		Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();

		System.out.println(solution(m, c, e));
		//System.out.println(Arrays.toString(solution(b)));
		// System.out.println(solution(b, d));
	}

	public static int solution(int n, int[] lost, int[] reserve) {
		
int[] people = new int[n + 2];
        
        int answer = n;
        
        // 분배 [ -1 : 잃어버린사람, 0 : 가진사람, 1 : 여벌있는사람]
        for(int i : reserve) {
        	people[i]++;
        }
        
        for(int i : lost) {
        	people[i]--;
        }
        
        // 앞 뒤 확인
        for(int i = 1; i <= n; i++) {
    		if(people[i] == -1) {
    			if(people[i-1] == 1) {
    				people[i-1]--;
    				people[i]++;
    			} else if(people[i + 1] == 1) {
    				people[i+1]--;
    				people[i]++;
    			} else {
                    answer--;
                }
    		}
        }
        
        return answer;
    }
}