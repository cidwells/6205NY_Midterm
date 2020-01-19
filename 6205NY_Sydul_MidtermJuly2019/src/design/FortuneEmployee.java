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
		System.out.print("Name " + firstEmployee.getName()+" ");
		System.out.print("salary: "+firstEmployee.getSalary()+" ");
		System.out.print("Id "+ firstEmployee.getEmployeeId()+" ");
		System.out.println("\n"+firstEmployee.calculateEmployeeBonus(3,firstEmployee.getSalary()));
		EmployeeInfo secondEmployee = new EmployeeInfo("Bart Simpson",101,"Developer",150000.00);
		System.out.print("Name " + secondEmployee.getName()+" ");
		System.out.print("salary: "+secondEmployee.getSalary()+" ");
		System.out.print("Id "+ secondEmployee.getEmployeeId()+" ");
		System.out.println("\n"+secondEmployee.calculateEmployeeBonus(2,secondEmployee.getSalary()));
		secondEmployee.calculateEmployeePension();



	}

}
