#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main(void) {
	vector<pair<int, string> > v;
	
	v.push_back(pair<int, string> (90, "È« ±æ µ¿"));
	v.push_back(pair<int, string> (80, "À§ À§"));
	v.push_back(pair<int, string> (98, "Æ® À£ ºê"));
	v.push_back(pair<int, string> (75, "Áø ¾ç Ã¶"));
	
	sort(v.begin(), v.end());
	for(int i = 0; i < v.size(); i++) {
		cout << v[i].second << ' ';
	}
	return 0;
}
