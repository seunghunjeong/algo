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

public class Main {

	public static void main(String[] args) {
		// System.out.println();
		String[] a = { "AN", "CF", "MJ", "RT", "NA" };
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
		int[] c = {31, 10, 45, 1, 6, 19};
		int[] e = { 3 };

		Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
//		StringUtil st = new StringUtil();
		
//		System.out.println(st.getTransactionUniqueId());
//		System.out.println(solution(b));
//		 System.out.println(Arrays.toString(solution(b, c)));
		 System.out.println(solution(n, m, k));
	}
	
	public static int solution(int a, int b, int n) {
        int answer = 0;
        
        // 바꿀 콜라병
        int x = 0;
        
        // 바꾼 콜라병
        int y = 0;
       
        
        // 나머지 병 수 
        int tmp = 0;
        
        while(n >= a) {
        	// 식 = 바꿀 콜라명 + 바꾼 콜라병 = 빈 콜라명
        	x = n % a;
        	y = (n / a) * b;
        	
        	n = x + y;
        	answer += y;
        };
        
        return answer;
    }
}