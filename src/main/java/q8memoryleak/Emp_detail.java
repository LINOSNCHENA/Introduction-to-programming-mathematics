package q8memoryleak;

import q2exams.cleanPemba;

class Emp {
	int id;
	String emp_name;

	public Emp(int id, String emp_name) {
		this.id = id;
		this.emp_name = emp_name;
	}
}

public class Emp_detail {
	private static Emp Emp_detail(int id, String emp_name) {
		return new Emp(id, emp_name);
	}

	public static void main(String[] args) {
		cleanPemba.clearScreen();
		int id = 21;
		String name = "Maddy";
		Emp person_ = null;
		String emp_name="marvin";
		person_ = Emp_detail(id, name);
		Emp person2 = Emp_detail(id, emp_name);
		System.out.println("=======================X1===========");
		System.out.println(person_);
		System.out.println(person2);
		System.out.println(person_.emp_name);
		System.out.println(person2.emp_name);
		System.out.println("=======================X2===========");
	}
}
