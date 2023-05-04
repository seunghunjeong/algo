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

public class 숫자짝꿍 {

	public static void main(String[] args) {
		// System.out.println();
		String[] a = { "AN", "CF", "MJ", "RT", "NA" };
		// int[] b = {1,2};
		// int[] b = IntStream.rangeClosed(2,51).boxed().mapToInt(i->i).toArray();
//		int[] b = { 44, 1, 0, 0, 31, 25 };
//		int[] b = { 1, 2, 3, 4};
		int[] b = { 5, 3, 2, 7, 5 };
		// int[] d = {2,2,7,8};
		int[][] d = { { 60, 50}, {30, 70}, {60, 30}, {80, 40} };
		String s = "5525";
		String ss = "1255";
		int n = 1;
		int m = 2;
		int k = 1;
		int[] c = {31, 10, 45, 1, 6, 19};
		int[] e = { 3 };

		Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
//		StringUtil st = new StringUtil();
		
//		System.out.println(st.getTransactionUniqueId());
//		System.out.println(solution(d));
//		 System.out.println(Arrays.toString(solution(b, c)));
		 System.out.println(solution(s, ss));
	}
	
	static int z = 0;

	public static String solution(String X, String Y) {
        String answer = "";
        
        int x = 0;
        int y = 0;
        
        String[] strX = X.split("");
        String[] strY = Y.split("");
        
//        Map<String, Integer> mapX = Stream.of(strX).collect(
//                Collectors.toMap(Function.identity(), value -> 1, Integer::sum)
//        );
//        Map<String, Integer> mapY = Stream.of(strY).collect(
//        		Collectors.toMap(Function.identity(), value -> 1, Integer::sum)
//		);
        
        Map<String, Integer> mapX = new HashMap<String, Integer>();
        Map<String, Integer> mapY = new HashMap<String, Integer>();
        
        for(String key: X.split("")) {
        	mapX.put(key, mapX.getOrDefault(key, 0)+1);
        }
        
        for(String key: Y.split("")) {
        	mapY.put(key, mapY.getOrDefault(key, 0)+1);
        }
        
        List<String> keySet = new ArrayList<>(mapX.keySet());
        Collections.reverse(keySet);
        
        for(String i : keySet) {
        	if(mapY.keySet().contains(i)) {
//        		y = mapY.get(i);
//        		x = mapX.get(i) > y ? y : mapX.get(i);
        		
        		for(int i1 = 0; i1 < x; i1++) {
        			answer += i;
        		}
        	}
        }
        
        if(answer.length() == 0)
        	return "-1";
        else if(answer.charAt(0) == '0')
        	return "0";
        
        return answer;
    }
}