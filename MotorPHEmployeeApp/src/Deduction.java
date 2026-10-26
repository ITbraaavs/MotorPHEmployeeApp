/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mjbie
 */
public class Deduction {
    public double sss;
    public double philHealth;
    public double pagIbig;
    public double withholdingTax;
    public double totalDeduction;
    
    public void calculateDeduct() {
        //total deduction = sum of all individual deductions
        totalDeduction = sss + philHealth + pagIbig + withholdingTax;
        System.out.println("Total Deductions: " + totalDeduction);
    }
    
}
