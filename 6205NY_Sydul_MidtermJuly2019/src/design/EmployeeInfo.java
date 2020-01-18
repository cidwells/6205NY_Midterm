package design;

import java.util.Date;
import java.util.Scanner;

public class EmployeeInfo extends AbstractWorker{
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */
 	private String name;
 	private int employeeId;
	private String deptName;
	private static double salary;

	public EmployeeInfo(){

	}
	public EmployeeInfo(String name, int employeeId, String deptName,double salary) {
		this.name = name;
		this.employeeId = employeeId;
		this.deptName = deptName;
		this.salary = salary;
	}

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;
	
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(int employeeId){
		this.employeeId = employeeId;
	}
    public EmployeeInfo(String name, int employeeId){
		this.name = name;
		this.employeeId =employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public static double getSalary() {
		return salary;
	}

	public static void setSalary(double salary) {
		EmployeeInfo.salary = salary;
	}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployeeBonus(int numberOfYearsWithCompany,double yearlySalary){
		double yearlyBonus = 0;
		if(numberOfYearsWithCompany>=5){
			yearlyBonus = yearlySalary *.10;
		}else if(numberOfYearsWithCompany==4){
			yearlyBonus = yearlySalary * .8;
		}else if(numberOfYearsWithCompany==3){
			yearlyBonus = yearlySalary * .4;
		}else if(numberOfYearsWithCompany == 2){
			yearlyBonus = yearlySalary * .1;
		}else if(numberOfYearsWithCompany==1){
			yearlyBonus = 0;
			System.out.println("No bonuses the first year");
		}return (int) yearlyBonus;
	}
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public static int calculateEmployeePension(){
		int total=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        //implement numbers of year from above two dates
		String startYear = convertedJoiningDate.substring(convertedJoiningDate.length() - 4, convertedJoiningDate.length());
		String currentYear = convertedTodaysDate.substring(convertedTodaysDate.length() - 4, convertedTodaysDate.length());
		int start = Integer.parseInt(startYear);
		int current = Integer.parseInt(currentYear);
		//Calculate pension
		int numberOfYears = current - start;

		if (numberOfYears >= 5) {
			total = (int) (salary * .25);
		} else if (numberOfYears == 4) {
			total = (int) (salary * .20);
		} else if (numberOfYears == 3) {
			total = (int) (salary * .15);
		} else if (numberOfYears == 2) {
			total = (int) (salary * .10);
		} else if (numberOfYears == 1) {
			total = (int) (salary * .05);
		} else if (numberOfYears == 0) {
			total = 0;
		}
		System.out.println("Pension: $" + total);


		return total;
	}

	@Override
	public int employeeId() {
		return employeeId;
	}

	@Override
	public String employeeName() {
		return name;
	}

	@Override
	public void assignDepartment() {
		this.deptName =deptName;
	}

	@Override
	public int calculateSalary() {
		return (int) salary;
	}

	@Override
	public void benefitLayout() {
		System.out.println("No benefits");
	}

	@Override
	public void retirement() {
		System.out.println("Congratulations");
	}

	@Override
	public void exit() {
		System.out.println("Good luck on your next assignment");
	}


	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
