package a;

import java.util.Random;

class Employee {
	void sal() {
		System.out.println("Some salary");
	}

	int getId() {
		return new Random().nextInt();
	}

}
