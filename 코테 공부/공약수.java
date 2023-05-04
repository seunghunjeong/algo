public class 공약수 {
	
	static int number = -1;
	
	public static void main(String[] args) {
		int numer1 = 9;
		int denom1 = 2;
		int numer2 = 1;
		int denom2 = 3;

		int numb = -1;
		int[] answer = new int[2];
		int tmp = 0;
		int _tmp = 0;
		
		if(gongYac(denom1, denom2) > -1) {
			if(gongYac(numer1, denom1) != -1 || gongYac(numer2, denom2) != -1) {
				if(denom1 > denom2) {
					numb = denom1;
					numer2 *= denom1/denom2; 
				} else if(denom1 < denom2) {
					numb = denom2;
					numer1 *= denom2/denom1; 
				}
			}
		} else {
			numb = gongYac(denom1, denom2);
			if(numb == -1) {
				numb = denom1 * denom2;
			}
	
			numer1 *= (numb/denom1);
			numer2 *= (numb/denom2);
		}
		tmp = numer1 + numer2;
		
		if(tmp % numb == 0) {
			_tmp = gongYac(numb, tmp);
			if(_tmp > 0) {
				tmp /= _tmp;
				numb /= _tmp;
			}
		}

		answer[0] = tmp;
		answer[1] = numb;

	}
	
	private static int gongYac(int x, int y) {
		if(y != 1) {
			if(x < y) {
				if(x != 0) {
					return gongYac(x, y % x);
				}
			} else {
				if(y != 0) {
					return gongYac(y, x % y);
				}
				
			}
			return x;
		}
		
		return -1;
	}
}