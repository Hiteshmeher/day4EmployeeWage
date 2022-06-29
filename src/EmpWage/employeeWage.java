package EmpWage;

public class employeeWage {

	static final int WagePerHour = 20;
	static final int FullDayHour = 8;
	static final int PartTimeHour = 4;
	static final int IsPartTime = 0;
	static final int IsFulltime = 1;
	static final int WorkingDayInMonth = 20;
	static final int WorkingHourPerMonth = 100;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Problem ");
		int dailyWages = 0;
		int MonthlyWages = 0;
		int workingDay = 1;
		int day = 1;
		int totalWorkingHoursInMonth = 0;
		while (workingDay <= WorkingDayInMonth && totalWorkingHoursInMonth <= WorkingHourPerMonth) {
			int attendance = (int) Math.floor(Math.random() * 10) % 3;
			switch (attendance) {
			case IsPartTime:
				System.out.println("Day " + day + " Half day");
				dailyWages = WagePerHour * PartTimeHour;
				System.out.println("Wages of the day " + day + " is " + dailyWages);
				MonthlyWages = dailyWages + MonthlyWages;
				totalWorkingHoursInMonth = totalWorkingHoursInMonth + PartTimeHour;
				break;
			case IsFulltime:
				System.out.println("Day " + day + " present");
				dailyWages = WagePerHour * FullDayHour;
				System.out.println("Wages of the day " + day + " is " + dailyWages);
				MonthlyWages = dailyWages + MonthlyWages;
				totalWorkingHoursInMonth = totalWorkingHoursInMonth + FullDayHour;
				break;
			default:
				System.out.println("Day " + day + " Absent");
				break;
			}
			day++;
			workingDay++;
		}
		System.out.println("Total Working Hours of the month: " + totalWorkingHoursInMonth);
		System.out.println("Wages of the month: " + MonthlyWages);
	}
}
