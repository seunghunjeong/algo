#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main(void) {
	vector<pair<int, string> > v;
	
	v.push_back(pair<int, string> (90, "ȫ �� ��"));
	v.push_back(pair<int, string> (80, "�� ��"));
	v.push_back(pair<int, string> (98, "Ʈ �� ��"));
	v.push_back(pair<int, string> (75, "�� �� ö"));
	
	sort(v.begin(), v.end());
	for(int i = 0; i < v.size(); i++) {
		cout << v[i].second << ' ';
	}
	return 0;
}
