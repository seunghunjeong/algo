#include <iostream>
#include <algorithm>

using namespace std;

class Student {
	public:
		string name;
		int score;
		Student(string name, int score) {
			this->name = name;
			this->score = score;
		}
		// 정렬 기준은 '점수가 작은 순서'
		bool operator <(Student &student) {
			return this->score < student.score;
		} 
};

int main(void) {
	Student students[] = {
		Student("홍 길 동", 90),
		Student("아 이 유", 80),
		Student("유 재 석", 65)
	};
	sort(students, students + 3);
	
	for(int i = 0; i < 3; i++) {
		cout << students[i].name << " ";
	}
}
