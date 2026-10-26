import java.io.*;
import java.util.ArrayList;

public class EmployeeDataHandler {

    // LOAD  employees from CSV
    public static ArrayList<String[]> loadEmployees() {

        ArrayList<String[]> employees = new ArrayList<>();

        try (BufferedReader reader =
                new BufferedReader(new FileReader("employee.csv"))) {

            String line;

            // Skip header
            reader.readLine();

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

for (int i = 0; i < data.length; i++) {

    data[i] = data[i].replace("\"", "").trim();

}

employees.add(data);

            }

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());

        }

        return employees;

    }

    // SAVE  a new employee
    public static void saveEmployee(Employee employee) {

        try {

            // Prevent duplicate Employee Numbers
            ArrayList<String[]> employees = loadEmployees();

            for (String[] emp : employees) {

                if (emp[0].equals(employee.getEmployeeNumber())) {

                    System.out.println("Duplicate Employee Number.");
                    return;

                }

            }

            BufferedWriter writer =
                    new BufferedWriter(new FileWriter("employee.csv", true));

            writer.newLine();

            writer.write(
                    employee.getEmployeeNumber() + "," +
                    employee.getLastName() + "," +
                    employee.getFirstName() + "," +
                    employee.getBirthday() + "," +
                    employee.getAddress() + "," +
                    employee.getPhoneNumber() + "," +
                    employee.getSSS() + "," +
                    employee.getPhilHealth() + "," +
                    employee.getTIN() + "," +
                    employee.getPagibig()
            );

            writer.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }
    // UPDATE  employee
public static void updateEmployee(Employee employee) {

    ArrayList<String[]> employees = loadEmployees();

    for (String[] emp : employees) {

        if (emp[0].equals(employee.getEmployeeNumber())) {

            emp[1] = employee.getLastName();
            emp[2] = employee.getFirstName();
            emp[6] = employee.getSSS();
            emp[7] = employee.getPhilHealth();
            emp[8] = employee.getTIN();
            emp[9] = employee.getPagibig();

            break;

        }

    }

    try {

        BufferedWriter writer =
                new BufferedWriter(new FileWriter("employee.csv"));

        writer.write("Employee #,Last Name,First Name,Birthday,Address,Phone Number,SSS #,Philhealth #,TIN #,Pag-ibig #,Status,Position,Immediate Supervisor,Basic Salary,Rice Subsidy,Phone Allowance,Clothing Allowance,Gross Semi-monthly Rate,Hourly Rate");

        writer.newLine();

       for (String[] emp : employees) {

    writer.write(
        emp[0] + "," +
        emp[1] + "," +
        emp[2] + "," +
        emp[3] + "," +
        "\"" + emp[4] + "\"," +
        emp[5] + "," +
        emp[6] + "," +
        emp[7] + "," +
        emp[8] + "," +
        emp[9] + "," +
        emp[10] + "," +
        emp[11] + "," +
        emp[12] + "," +
        "\"" + emp[13] + "\"," +
        "\"" + emp[14] + "\"," +
        "\"" + emp[15] + "\"," +
        "\"" + emp[16] + "\"," +
        "\"" + emp[17] + "\"," +
        emp[18]
    );


    writer.newLine();

}

        writer.close();

    } catch (IOException e) {

        e.printStackTrace();

    }

}
// DELETE employee
public static void deleteEmployee(String employeeNumber) {

    ArrayList<String[]> employees = loadEmployees();

    employees.removeIf(emp -> emp[0].equals(employeeNumber));

    try {

        BufferedWriter writer =
                new BufferedWriter(new FileWriter("employee.csv"));

        writer.write("Employee #,Last Name,First Name,Birthday,Address,Phone Number,SSS #,Philhealth #,TIN #,Pag-ibig #,Status,Position,Immediate Supervisor,Basic Salary,Rice Subsidy,Phone Allowance,Clothing Allowance,Gross Semi-monthly Rate,Hourly Rate");

        writer.newLine();

      for (String[] emp : employees) {

    writer.write(
        emp[0] + "," +
        emp[1] + "," +
        emp[2] + "," +
        emp[3] + "," +
        "\"" + emp[4] + "\"," +
        emp[5] + "," +
        emp[6] + "," +
        emp[7] + "," +
        emp[8] + "," +
        emp[9] + "," +
        emp[10] + "," +
        emp[11] + "," +
        emp[12] + "," +
        "\"" + emp[13] + "\"," +
        "\"" + emp[14] + "\"," +
        "\"" + emp[15] + "\"," +
        "\"" + emp[16] + "\"," +
        "\"" + emp[17] + "\"," +
        emp[18]
    );

    writer.newLine();

}

        writer.close();

    } catch (IOException e) {

        e.printStackTrace();

    }

}

}