import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.io.entity.ByteArrayEntity;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class 햄버거시간초과 {

	public static void main(String[] args) {
		// System.out.println();
		String[] a = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
		// int[] b = {1,2};
		// int[] b = IntStream.rangeClosed(2,51).boxed().mapToInt(i->i).toArray();
//		int[] b = { 44, 1, 0, 0, 31, 25 };
//		int[] b = { 1, 2, 3, 4};
		int[] b = { -2, 3, 0, 2, -5 };
		// int[] d = {2,2,7,8};
		int[][] d = { { 60, 50}, {30, 70}, {60, 30}, {80, 40} };
		String s = "5525";
		String ss = "1255";
		int n = 3;
		int m = 1;
		int k = 20;
		int[] c = {2, 1, 1, 2, 3, 1, 2, 3, 1};
		int[] e = { 3 };

		Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
//		StringUtil st = new StringUtil();
		
//		System.out.println(st.getTransactionUniqueId());
		System.out.println(solution(c));
//		 System.out.println(Arrays.toString(solution(b, c)));
//		 System.out.println(solution(n, m, k));
	}
	
	public static int solution(int[] ingredient) {
        int answer = 0;
        
        int len = 0;
        int n = 0;
        
        // 숫자만 빼오기
        String str = Arrays.toString(ingredient).replaceAll("[^0-9]","");

        while(str.length() != len) {
        	len = str.length();
    		
    		int tmp = 0;
    		
    		str = str.replaceFirst("1231", "");
    		
    		if(str.length() == len)
    			answer = n;
    		else {
    			tmp = ((len - str.length()) / 4);
    			n = n + tmp;
    		}
        }
        
// int answer = 0;
//        
//        List<Integer> il = Arrays.stream(ingredient).boxed().collect(Collectors.toList());
//        
//        for(int i = 0; i < il.size(); i++) {
//        	if(il.size() < 4)
//        		break;
//        	if(il.get(i) == 1 && i <= il.size() - 4) {
//        		if(il.get(i + 1) == 2) {
//        			if(il.get(i + 2) == 3) {
//        				if(il.get(i + 3) == 1) {
//        					answer++;
//        					il.remove(i);
//        					il.remove(i);
//        					il.remove(i);
//        					il.remove(i);
//        					i = -1;
//        				} else {
//        					i+=2;
//        				}
//        			} else {
//        				i++;
//        			}
//        		}
//        	}
//        }
//        
        return answer;
    }
	
//	// 햄버거 만들기
//	private static int chk(String str, int n) {
//		int len = str.length();
//		
//		str = str.replaceFirst("1231", "");
//		
//		if(str.length() == len)
//			return n;
//		else
//			return chk(str, n + 1);
//	}
}