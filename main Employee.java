public class DeclareTwoEmployees
{
public static void main(String[]args)
	{
	Employee clerk = new Employee();
	Employee driver = new Employee();
	
	clerk.setEmpNum(345);
	driver.setEmpNum(567);
	System.out.println("The clerk's salary is " +



	clerk.getEmpSalary() + " and the driver's salary is "
	+ driver.getEmpSalary());
	}
}
