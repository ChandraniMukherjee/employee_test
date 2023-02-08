package a;

class Case {
	static int check(Employee e) {
		return e.getId();
	}

	static HR check_HR() {
		return new HR();
	}

	static Developer check_Dev() {
		return new Developer();
	}

	static Employee check_Any1() {
		return new HR();
	}

	static Employee check_Any2() {
		return new Developer();
	}

	static Employee check_Name(String type) {
		if (type.equalsIgnoreCase("Dev"))
			return new Developer();
		else
			return new HR();
	}

}
