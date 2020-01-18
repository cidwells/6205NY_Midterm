package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {

		EmployeeInfo firstEmployee = new EmployeeInfo("Cid Nero",100,"QA",100000.00);
		EmployeeInfo secondEmployee = new EmployeeInfo("Bart Simpson",101,"Developer",200000.00);
		System.out.println(firstEmployee.getEmployeeId());
		System.out.println(secondEmployee.calculateSalary());
		secondEmployee.exit(1/9/2011);
		secondEmployee.calculateSalary();
		System.out.println(EmployeeInfo.calculateEmployeeBonus(4,200000));
	}

}
