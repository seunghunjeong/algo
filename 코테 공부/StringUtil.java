import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class StringUtil {
	
	public static void main(String[] ar)throws Exception{
		System.out.println(getTransactionUniqueId());
	}
	
	public static synchronized String getTransactionUniqueId() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS",Locale.KOREA);
		String cur = sdf.format(new Date());
		String transactionUniqueId = cur + StringUtil.keyGen(8);
		return transactionUniqueId;
	}

	private static Random r = new Random(System.currentTimeMillis());
	
	public static String keyGen(int length) {
		char[] key = new char[length];

		int tmp = 0;
		for (int i = 0; i < length; i++) {
			tmp = r.nextInt(3);
			if (tmp == 0)
				key[i] = (char) (r.nextInt(26) + 65);
			else if (tmp == 1)
				key[i] = (char) (r.nextInt(10) + 48);
			else if (tmp == 2)
				key[i] = (char) (r.nextInt(26) + 97);
			else {
				key[i] = (char) r.nextInt(256);
			}
		}

		return String.valueOf(key);
	}

	//
	public static String textToHtml(String str) {

		if (str != null && str.length() > 0) {

			str = str.replaceAll("\n", "<br>");
			str = str.replaceAll(" ", "&nbsp;");
			str = str.replaceAll("\"", "&quot;");
			str = str.replaceAll("'", "&#39;");
			str = str.replaceAll("<", "&lt;");
			str = str.replaceAll(">", "&gt;");
		}

		return str;
	}

	public static String htmlToText(String str) {

		if (str != null && str.length() > 0) {

			str = str.replaceAll("<br>", "\n");
			str = str.replaceAll("<BR>", "\n");
			str = str.replaceAll("&nbsp;", " ");
			str = str.replaceAll("&quot;", "\"");
			str = str.replaceAll("&#39;", "'");
			str = str.replaceAll("&lt;", "<");
			str = str.replaceAll("&gt;", ">");
		}

		return str;
	}

	//
	public static String fillZero(String str, int size) {
		return fill(str, size, "0", true);
	}

	public static String fillSpace(String str, int size) {
		return fill(str, size, " ", false);
	}

	public static String fill(String str, int size, String chr, boolean insert) {

		if (str == null) {
			str = "";
		}
		if (str.length() >= size) {
			return str;
		}

		int lack = size - str.getBytes().length;
		StringBuffer sb = new StringBuffer(str);
		if (insert) {
			for (int i = 0; i < lack; i++) {
				sb.insert(0, chr);
			}
		} else {
			for (int i = 0; i < lack; i++) {
				sb.append(chr);
			}
		}

		return sb.toString();
	}

	public static boolean isNull(String data) {
		return (data == null || data.length() == 0);
	}

	//
	//	public static void trim(StringBuffer str) {
	//		trimFirst(str);
	//		trimLast(str);
	//	}
	//
	public static void trimFirst(StringBuffer str) {
		while (str.indexOf(" ") == 0 || str.indexOf("\n") == 0 || str.indexOf("\t") == 0 || str.indexOf("\r") == 0) {
			str.delete(0, 1);
		}
	}
	//
	//	public static void trimLast(StringBuffer str) {
	//		int idx = str.length() - 1;
	//		while (str.indexOf(" ") == idx || str.indexOf("\n") == idx || str.indexOf("\t") == idx || str.indexOf("\r") == idx) {
	//			str.delete(0, 1);
	//			idx = str.length() - 1;
	//		}
	//	}
	
	public static String exceptionToString(Throwable e) {

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		e.printStackTrace(new PrintWriter(bos, true));

		return bos.toString();
	}
	
	/**
	 * 객체가 null인지 확인하고 null인 경우 "" 로 바꾸는 메서드
	 * @param object 원본 객체
	 * @return resultVal 문자열
	 */
	public static String isNullToString(Object object) {
		String string = "";

		if (object != null) {
			string = object.toString().trim();
		}

		return string;
	}	
	
}
