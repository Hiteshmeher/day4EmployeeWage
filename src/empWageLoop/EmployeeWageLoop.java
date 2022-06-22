package empWageLoop;

public class EmployeeWageLoop {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage");
		int isPresent = (int) (Math.floor(Math.random() * 10) % 3);
		if (isPresent == 0)
			System.out.println("Employee is not Present");
		else if (isPresent == 1)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is doing Part Time");
	}

}
