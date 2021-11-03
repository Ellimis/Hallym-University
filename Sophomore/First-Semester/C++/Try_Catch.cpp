#include <iostream>
#include <string>

using namespace std;

class err {
	string oper;
public:
	err(string exp) {
		this->oper = exp;
	}
	void what() {
		cout << "oper : " << this->oper << endl;
	}
};

class cpu {
	string step;
public:
	void setStep(string x) {
		this->step = x;
	}
	void fetch() throw(err);
};

void cpu::fetch() {
	if (this->step == "") {
		throw err("½Ã¹ß");
	}
	else {
		cout << this->step;
	}
}

int main() {
	cpu c;

	c.setStep("");
	
	try {
		c.fetch();
	}
	catch (err& e) {
		e.what();
	}

	return 0;
}