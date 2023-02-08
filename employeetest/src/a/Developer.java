package a;

class Developer extends Employee {

	@Override
	void sal() {
		System.out.println("Dev Salary!!!");
	}

	@Override
	int getId() {
		return 1000;
	}

	void coder() {
		System.out.println("Create project in JAVA");
	}

}
