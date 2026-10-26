import java.time.Duration;
import java.time.LocalTime;

public class SalaryComputationModule {

    // Compute hours worked with 10-minute grace period
    public static double computeHoursWorked(String login, String logout) {

        try {

            if (login.length() == 4) {
    login = "0" + login;
}

if (logout.length() == 4) {
    logout = "0" + logout;
}

LocalTime loginTime = LocalTime.parse(login);
LocalTime logoutTime = LocalTime.parse(logout);

            // 10-minute grace period (8:00 - 8:10)
            if (loginTime.getHour() == 8 && loginTime.getMinute() <= 10) {
                loginTime = LocalTime.of(8, 0);
            }

           double hours = Duration.between(loginTime, logoutTime).toMinutes() / 60.0;

// Deduct 1 hour lunch break
hours -= 1;

// Don't allow negative hours
if (hours < 0) {
    hours = 0;
}

return hours;

} catch (Exception e) {

    return 0;

}


    }
    

    // Gross Pay
    public static double computeGrossPay(double hourlyRate, double totalHours) {

        return hourlyRate * totalHours;

    }

    // Total Deductions
    public static double computeTotalDeductions(
            double sss,
            double philHealth,
            double pagibig,
            double withholdingTax) {

        return sss + philHealth + pagibig + withholdingTax;

    }

    // Net Pay
    public static double computeNetPay(
            double grossPay,
            double totalDeductions) {

        return grossPay - totalDeductions;

    }

}