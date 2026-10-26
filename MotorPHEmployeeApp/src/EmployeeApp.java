/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author mjbie
 */

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.util.ArrayList;

public class EmployeeApp extends JFrame {

    private JTextField txtEmpNo;
    private JTextField txtLastName;
    private JTextField txtFirstName;
    private JTextField txtSSS;
    private JTextField txtPhilHealth;
    private JTextField txtTIN;
    private JTextField txtPagibig;

   private JButton btnAdd;
private JButton btnUpdate;
private JButton btnDelete;
private JButton btnClear;
private JButton btnCompute;

    private JTable table;
    private DefaultTableModel model;

    public EmployeeApp() {

        setTitle("MotorPH Employee Management");
        setSize(1100,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(242, 247, 252));
        JLabel title = new JLabel("MOTORPH EMPLOYEE MANAGEMENT", SwingConstants.CENTER);
title.setFont(new Font("Segoe UI", Font.BOLD, 22));
title.setForeground(new Color(44, 62, 80));

        JPanel formPanel = new JPanel(new GridLayout(7, 2, 18, 5));
        formPanel.setBorder(
    BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(new Color(220,220,220)),
        BorderFactory.createEmptyBorder(20,20,20,20)
    )
);
formPanel.setPreferredSize(new Dimension(470,  210));

        txtEmpNo = new JTextField();
        txtLastName = new JTextField();
        txtFirstName = new JTextField();
        txtSSS = new JTextField();
        txtPhilHealth = new JTextField();
        txtTIN = new JTextField();
        txtPagibig = new JTextField();

        formPanel.add(new JLabel("Employee Number"));
        formPanel.add(txtEmpNo);

        formPanel.add(new JLabel("Last Name"));
        formPanel.add(txtLastName);

        formPanel.add(new JLabel("First Name"));
        formPanel.add(txtFirstName);

        formPanel.add(new JLabel("SSS"));
        formPanel.add(txtSSS);

        formPanel.add(new JLabel("PhilHealth"));
        formPanel.add(txtPhilHealth);

        formPanel.add(new JLabel("TIN"));
        formPanel.add(txtTIN);

        formPanel.add(new JLabel("PagIBIG"));
        formPanel.add(txtPagibig);


        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,20,10));
        buttonPanel.setBackground(Color.WHITE);

btnAdd = new GradientButton("Add Employee");
btnUpdate = new GradientButton("Update Employee");
btnDelete = new GradientButton("Delete Employee");
btnClear = new GradientButton("Clear");
btnCompute = new GradientButton("Compute Salaries");


Dimension buttonSize = new Dimension(175, 32);

JButton[] buttons = {
    btnAdd,
    btnUpdate,
    btnDelete,
    btnClear,
    btnCompute
};

for (JButton button : buttons) {

    button.setPreferredSize(buttonSize);
    button.setFocusPainted(false);

    button.setBorder(
    BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(
            new Color(210, 215, 220)),
        BorderFactory.createEmptyBorder(5, 12, 5, 12)
    )
);

    button.setFont(new Font("Segoe UI", Font.PLAIN, 13));
}

buttonPanel.add(btnAdd);
buttonPanel.add(btnUpdate);
buttonPanel.add(btnDelete);
buttonPanel.add(btnClear);
buttonPanel.add(btnCompute);

model = new DefaultTableModel();
model.setColumnIdentifiers(new Object[]{
    "Employee #",
    "Last Name",
    "First Name",
    "Birthday",
    "Address",
    "Phone",
    "SSS",
    "PhilHealth",
    "TIN",
    "PagIBIG",
    "Gross Pay",
    "Total Deductions",
    "Net Pay"
});

       table = new JTable(model);

// Table behavior
table.setDefaultEditor(Object.class, null);
table.setRowHeight(21);
table.getTableHeader().setReorderingAllowed(false);

// Header appearance
table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 13));
table.getTableHeader().setPreferredSize(new Dimension(0, 32));
table.getTableHeader().setBackground(new Color(245,245,245));
table.setSelectionBackground(new Color(220,230,240));
table.setSelectionForeground(Color.BLACK);

// Salary column widths
table.getColumnModel().getColumn(10).setPreferredWidth(120);
table.getColumnModel().getColumn(11).setPreferredWidth(140);
table.getColumnModel().getColumn(12).setPreferredWidth(120);

// Right-align salary columns
DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);

table.getColumnModel().getColumn(10).setCellRenderer(rightRenderer);
table.getColumnModel().getColumn(11).setCellRenderer(rightRenderer);
table.getColumnModel().getColumn(12).setCellRenderer(rightRenderer);

//Center header text
DefaultTableCellRenderer headerRenderer =
        (DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer();

headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

JScrollPane scrollPane = new JScrollPane(table);

      JPanel topPanel = new JPanel();

topPanel.setBackground(Color.WHITE);

topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));

topPanel.setBackground(Color.WHITE);

JLabel formTitle = new JLabel("Employee Information");
formTitle.setFont(new Font("Segoe UI", Font.BOLD, 16));
formTitle.setForeground(new Color(38,70,83));
formTitle.setAlignmentX(Component.CENTER_ALIGNMENT);

JPanel formContainer = new JPanel(new GridBagLayout());

formContainer.setBackground(Color.WHITE);

formContainer.add(formPanel);

JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

titlePanel.setBackground(Color.WHITE);

titlePanel.add(formTitle);

titlePanel.setAlignmentX(Component.CENTER_ALIGNMENT);
formContainer.setAlignmentX(Component.CENTER_ALIGNMENT);

topPanel.add(titlePanel);
topPanel.add(Box.createVerticalStrut(5));
topPanel.add(formContainer);

JPanel northPanel = new JPanel(new BorderLayout());
northPanel.setBackground(Color.WHITE);

northPanel.add(title, BorderLayout.NORTH);
northPanel.add(topPanel, BorderLayout.CENTER);

JPanel centerPanel = new JPanel(new BorderLayout());

centerPanel.setBackground(Color.WHITE);

centerPanel.add(northPanel, BorderLayout.NORTH);

centerPanel.setBorder(
        BorderFactory.createEmptyBorder(10, 0, 10, 0)
);

JPanel tablePanel = new JPanel(new BorderLayout());

tablePanel.setBackground(Color.WHITE);

tablePanel.setBorder(
        BorderFactory.createEmptyBorder(20, 0, 0, 0)
);

tablePanel.add(scrollPane, BorderLayout.CENTER);

centerPanel.add(tablePanel, BorderLayout.CENTER);

add(centerPanel, BorderLayout.CENTER);

add(buttonPanel, BorderLayout.SOUTH);
                loadEmployees();

        btnAdd.addActionListener(e -> addEmployee());
        btnUpdate.addActionListener(e -> updateEmployee());
btnDelete.addActionListener(e -> deleteEmployee());
        

        btnClear.addActionListener(e -> {

            txtEmpNo.setText("");
            txtLastName.setText("");
            txtFirstName.setText("");
            txtSSS.setText("");
            txtPhilHealth.setText("");
            txtTIN.setText("");
            txtPagibig.setText("");

        });
btnCompute.addActionListener(e -> computeSalaries());
table.getSelectionModel().addListSelectionListener(e -> {

    if (!e.getValueIsAdjusting() && table.getSelectedRow() != -1) {

        int row = table.getSelectedRow();

        txtEmpNo.setText(model.getValueAt(row, 0).toString());
        txtLastName.setText(model.getValueAt(row, 1).toString());
        txtFirstName.setText(model.getValueAt(row, 2).toString());
        txtSSS.setText(model.getValueAt(row, 6).toString());
        txtPhilHealth.setText(model.getValueAt(row, 7).toString());
        txtTIN.setText(model.getValueAt(row, 8).toString());
        txtPagibig.setText(model.getValueAt(row, 9).toString());

    }

});
    }

    // Load employees from CSV
    private void loadEmployees() {

        model.setRowCount(0);

        ArrayList<String[]> employees = EmployeeDataHandler.loadEmployees();

        for (String[] emp : employees) {

            if (emp.length >= 7) {

                model.addRow(new Object[]{
    emp[0],
    emp[1],
    emp[2],
    emp[3],
    emp[4],
    emp[5],
    emp[6],
    emp[7],
    emp[8],
    emp[9],
    "",
    "",
    ""
});

            }

        }

    }

    // Add employee
private void addEmployee() {

    if (txtEmpNo.getText().trim().isEmpty()
            || txtLastName.getText().trim().isEmpty()
            || txtFirstName.getText().trim().isEmpty()) {

        JOptionPane.showMessageDialog(
                this,
                "Please complete all required fields."
        );
        return;
    }

    try {

        Integer.parseInt(txtEmpNo.getText().trim());

        Employee employee = new Employee(

                txtEmpNo.getText().trim(),
                txtLastName.getText().trim(),
                txtFirstName.getText().trim(),

                "", // Birthday
                "", // Address
                "", // Phone Number

                txtSSS.getText().trim(),
                txtPhilHealth.getText().trim(),
                txtTIN.getText().trim(),
                txtPagibig.getText().trim()

        );

        EmployeeDataHandler.saveEmployee(employee);

        loadEmployees();

        JOptionPane.showMessageDialog(
                this,
                "Employee added successfully."
        );

        txtEmpNo.setText("");
        txtLastName.setText("");
        txtFirstName.setText("");
        txtSSS.setText("");
        txtPhilHealth.setText("");
        txtTIN.setText("");
        txtPagibig.setText("");

            } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(
                    this,
                    "Employee Number must be numeric."
            );

        }

    }

    private void updateEmployee() {

    if (txtEmpNo.getText().trim().isEmpty()) {

        JOptionPane.showMessageDialog(
                this,
                "Please select an employee first."
        );

        return;

    }

    Employee employee = new Employee(

            txtEmpNo.getText().trim(),
            txtLastName.getText().trim(),
            txtFirstName.getText().trim(),

            "", // Birthday
            "", // Address
            "", // Phone Number

            txtSSS.getText().trim(),
            txtPhilHealth.getText().trim(),
            txtTIN.getText().trim(),
            txtPagibig.getText().trim()

    );

    EmployeeDataHandler.updateEmployee(employee);

    loadEmployees();

    JOptionPane.showMessageDialog(
            this,
            "Employee updated successfully."
    );
    txtEmpNo.setText("");
txtLastName.setText("");
txtFirstName.setText("");
txtSSS.setText("");
txtPhilHealth.setText("");
txtTIN.setText("");
txtPagibig.setText("");

}


private void deleteEmployee() {

    if (txtEmpNo.getText().trim().isEmpty()) {

        JOptionPane.showMessageDialog(
                this,
                "Please select an employee first."
        );

        return;

    }
    int confirm = JOptionPane.showConfirmDialog(

        this,
        "Are you sure you want to delete this employee?",
        "Confirm Delete",
        JOptionPane.YES_NO_OPTION

);

if (confirm != JOptionPane.YES_OPTION) {

    return;

}

    int choice = JOptionPane.showConfirmDialog(
            this,
            "Are you sure you want to delete this employee?",
            "Confirm Delete",
            JOptionPane.YES_NO_OPTION
    );

    if (choice == JOptionPane.YES_OPTION) {

        EmployeeDataHandler.deleteEmployee(
                txtEmpNo.getText().trim()
        );

        loadEmployees();

        txtEmpNo.setText("");
        txtLastName.setText("");
        txtFirstName.setText("");
        txtSSS.setText("");
        txtPhilHealth.setText("");
        txtTIN.setText("");
        txtPagibig.setText("");

        JOptionPane.showMessageDialog(
                this,
                "Employee deleted successfully."
        );

    }

}
    
    
    
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            new EmployeeApp().setVisible(true);

        });

    }
    private void computeSalaries() {

    ArrayList<String[]> employees = EmployeeDataHandler.loadEmployees();
ArrayList<String[]> attendance = AttendanceDataHandler.loadAttendance();


    model.setRowCount(0);

    for (String[] emp : employees) {

    try {

        String employeeNo = emp[0];

        

        double hourlyRate = Double.parseDouble(emp[18]);


        double totalHours = 0;

        for (String[] att : attendance) {

    if (att[0].trim().equals(employeeNo.trim())) {

        double hours = SalaryComputationModule.computeHoursWorked(
                att[4].trim(),
                att[5].trim()
        );

        totalHours += hours;

    }

}



double grossPay =
        SalaryComputationModule.computeGrossPay(
                hourlyRate,
                totalHours
        );

        double sss =
                DeductionCalculator.computeSSS(grossPay);

        double philHealth =
                DeductionCalculator.computePhilHealth(grossPay);

        double pagibig =
                DeductionCalculator.computePagIBIG(grossPay);

        double taxableIncome =
                grossPay
                - sss
                - philHealth
                - pagibig;

        double withholdingTax =
                DeductionCalculator.computeWithholdingTax(
                        taxableIncome
                );

        double deductions =
                SalaryComputationModule.computeTotalDeductions(
                        sss,
                        philHealth,
                        pagibig,
                        withholdingTax
                );

        double netPay =
                SalaryComputationModule.computeNetPay(
                        grossPay,
                        deductions
                );

        model.addRow(new Object[]{

                emp[0],
                emp[1],
                emp[2],
                emp[3],
                emp[4],
                emp[5],
                emp[6],
                emp[7],
                emp[8],
                emp[9],

                String.format("₱%,.2f", grossPay),
                String.format("₱%,.2f", deductions),
                String.format("₱%,.2f", netPay),

        });

    } catch (Exception e) {

        e.printStackTrace();

        JOptionPane.showMessageDialog(
                this,
                "Error on employee " + emp[0] + "\n\n" + e.toString()
        );

        break;

    }

}}}