/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mjbie
 */
public class Employee {

    private String employeeNumber;
    private String lastName;
    private String firstName;
    private String birthday;
    private String address;
    private String phoneNumber;
    private String sss;
    private String philHealth;
    private String tin;
    private String pagibig;

    public Employee(
            String employeeNumber,
            String lastName,
            String firstName,
            String birthday,
            String address,
            String phoneNumber,
            String sss,
            String philHealth,
            String tin,
            String pagibig) {

        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.sss = sss;
        this.philHealth = philHealth;
        this.tin = tin;
        this.pagibig = pagibig;

    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSSS() {
        return sss;
    }

    public String getPhilHealth() {
        return philHealth;
    }

    public String getTIN() {
        return tin;
    }

    public String getPagibig() {
        return pagibig;
    }

}