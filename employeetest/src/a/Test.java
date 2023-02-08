package a;

import javax.swing.JOptionPane;

class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HR h = new HR();
		h.sal();
		System.out.println(h.getId());
		Developer d = new Developer();
		d.sal();
		System.out.println(d.getId());

		System.out.println("----Late Binding----");

		Employee e = new Employee();
		e.sal();
		System.out.println(e.getClass());
		System.out.println(e.getId());

		e = new Developer();
		e.sal();
		System.out.println(e.getClass());
		System.out.println(e.getId());
		Payroll.paySal(e);

		e = new HR();
		e.sal();
		System.out.println(e.getClass());
		System.out.println(e.getId());
		Payroll.paySal(h);

		System.out.println("--------------------");
		Employee k = new HR();
		System.out.println(Case.check(k));
		k = new Developer();
		System.out.println(Case.check(k));

		System.out.println("--------------------");
		HR goth = Case.check_HR();
		goth.sal();

		Developer gotD = Case.check_Dev();
		gotD.sal();
		Employee f = Case.check_Name(JOptionPane.showInputDialog("Enter", "Type here"));
		f.sal();

	}

}
