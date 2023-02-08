package a;

class HR extends Employee {

	@Override
	void sal() {
		System.out.println("HR salary !!!!");
	}

	@Override
	int getId() {
		// TODO Auto-generated method stub
		return 100;
	}

	void recruit() {
		System.out.println("New employee joining");
	}

}
