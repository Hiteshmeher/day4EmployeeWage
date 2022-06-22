package empWageLoop;

public class EmployeeWageLoop {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage");
		int wagePerHour = 20;
		int numberOfHours = 8;
		int isPresent = (int) (Math.floor(Math.random() * 10) % 2);
		if (isPresent == 0)
			System.out.println("Employee is not Present");
		else if (isPresent == 1)
			System.out.println("Employee is Present");
		    System.out.println("Employee earn = " + numberOfHours * wagePerHour);
	}

}
