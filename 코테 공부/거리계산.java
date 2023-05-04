import java.util.ArrayList;

public class 거리계산 {
	public static void main(String[] args) {
		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "left";
		String answer = "";
		
		int rP = 3;
		int lP = 3;
		int _rP = 0;
		int _lP = 0;
		int _tmp = 0;
		
		for(int i : numbers) {
			switch (i) {
			case 1 :
			case 4 :
			case 7 :
				lP = i/3;
				answer += "L";
				break;
			case 3 :
			case 6 :
			case 9 :
				rP = i/4;
				answer += "R";
				break;
			default :
				if(i == 8) {
					_tmp = 3;
				} else if(i == 0) {
					_tmp = 4;
				} else {
					_tmp = i/2;
				}
				
				if(rP == lP) {
					switch (hand) {
					case "right" :
						answer += "R";
						rP = _tmp;
						break;
					default : 
						answer += "L";
						lP = _tmp;
						break;
					}
				} else {
					_rP = Math.abs(rP - _tmp);
					_lP = Math.abs(lP - _tmp);
					if(rP != 4) {
						if(_tmp < rP) {
							_rP = 3;
						} 
					} 
					if(lP != 4) {
						if(_tmp < lP) {
							_lP = 3;
						}
					}
					if(_rP == 0) {
						_rP = 2;
					}
					if(_lP == 0) {
						_lP = 2;
					}
//					_rP = _tmp - rP > -1 ? _tmp - rP : _tmp - rP + 1;
//					_lP = _tmp - lP > -1 ? _tmp - lP : _tmp - lP + 1;
					
					if(_rP < _lP) {
						rP = _tmp;
						answer += "R";
					} else if (_rP > _lP){
						lP = _tmp;
						answer += "L";
					} else {
						switch (hand) {
						case "right" :
							answer += "R";
							rP = _tmp;
							break;
						default : 
							answer += "L";
							lP = _tmp;
							break;
						}
					}
				}
				break;
			}
		}
		System.out.println(answer);
//		String answer = "";
//	       int rP = 3;
//			int lP = 3;
//			int _rP = 0;
//			int _lP = 0;
//			int _tmp = 0;
//			
//			for(int i : numbers) {
//				switch (i) {
//				case 1 :
//				case 4 :
//				case 7 :
//					lP = i/3;
//					answer += "L";
//					break;
//				case 3 :
//				case 6 :
//				case 9 :
//					rP = i/4;
//					answer += "R";
//					break;
//				default :
//					if(i == 8) {
//						_tmp = 3;
//					} else if(i == 0) {
//						_tmp = 4;
//					} else {
//						_tmp = i/2;
//					}
//					
//					if(rP == lP) {
//						switch (hand) {
//						case "right" :
//							answer += "R";
//							rP = _tmp;
//							break;
//						default : 
//							answer += "L";
//							lP = _tmp;
//							break;
//						}
//					} else {
//						_rP = Math.abs(rP - _tmp);
//						_lP = Math.abs(lP - _tmp);
//						if(rP != 4) {
//							if(_tmp < rP) {
//								_rP = 3;
//							} 
//						} 
//						if(lP != 4) {
//							if(_tmp < lP) {
//								_lP = 3;
//							}
//						}
//						if(_rP == 0) {
//							_rP = 2;
//						}
//						if(_lP == 0) {
//							_lP = 2;
//						}
//						if(_rP < _lP) {
//							rP = _tmp;
//							answer += "R";
//						} else if (_rP > _lP){
//							lP = _tmp;
//							answer += "L";
//						} else {
//							switch (hand) {
//							case "right" :
//								answer += "R";
//								rP = _tmp;
//								break;
//							default : 
//								answer += "L";
//								lP = _tmp;
//								break;
//							}
//						}
//					}
//					break;
//				}
//			}
//	        return answer;
	}
}