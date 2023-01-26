#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

bool compare(pair<string, pair<int, int> > a,
			pair<string, pair<int, int> > b) {
				if(a.second.first == b.second.first) {
					return a.second.second > b.second.second;
				} else {
					return a.second.first > b.second.first;
				}
			}

int main(void) {
	vector<pair<string, pair<int, int> > > v;
	
	v.push_back(pair<string, pair<int, int> > ("ȫ �� ��", pair<int, int>(90, 19961222)));
	v.push_back(pair<string, pair<int, int> > ("�� �� ��", pair<int, int>(70, 20100131)));
	v.push_back(pair<string, pair<int, int> > ("�� �� ö", pair<int, int>(60, 20100131)));
	v.push_back(pair<string, pair<int, int> > ("�� �� ��", pair<int, int>(90, 19920202)));
	
	sort(v.begin(), v.end(), compare);
	for(int i = 0; i < v.size(); i++) { 
		cout << v[i].first << ' ';
	}
	return 0;
}
