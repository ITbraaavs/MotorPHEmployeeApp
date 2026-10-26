public class DeductionCalculator {

    // SSS
    public static double computeSSS(double monthlySalary) {

        if (monthlySalary <= 3250) return 135.00;
        else if (monthlySalary <= 3750) return 157.50;
        else if (monthlySalary <= 4250) return 180.00;
        else if (monthlySalary <= 4750) return 202.50;
        else if (monthlySalary <= 5250) return 225.00;
        else if (monthlySalary <= 5750) return 247.50;
        else if (monthlySalary <= 6250) return 270.00;
        else if (monthlySalary <= 6750) return 292.50;
        else if (monthlySalary <= 7250) return 315.00;
        else if (monthlySalary <= 7750) return 337.50;
        else if (monthlySalary <= 8250) return 360.00;
        else if (monthlySalary <= 8750) return 382.50;
        else if (monthlySalary <= 9250) return 405.00;
        else if (monthlySalary <= 9750) return 427.50;
        else if (monthlySalary <= 10250) return 450.00;
        else if (monthlySalary <= 10750) return 472.50;
        else if (monthlySalary <= 11250) return 495.00;
        else if (monthlySalary <= 11750) return 517.50;
        else if (monthlySalary <= 12250) return 540.00;
        else if (monthlySalary <= 12750) return 562.50;
        else if (monthlySalary <= 13250) return 585.00;
        else if (monthlySalary <= 13750) return 607.50;
        else if (monthlySalary <= 14250) return 630.00;
        else if (monthlySalary <= 14750) return 652.50;
        else if (monthlySalary <= 15250) return 675.00;
        else if (monthlySalary <= 15750) return 697.50;
        else if (monthlySalary <= 16250) return 720.00;
        else if (monthlySalary <= 16750) return 742.50;
        else if (monthlySalary <= 17250) return 765.00;
        else if (monthlySalary <= 17750) return 787.50;
        else if (monthlySalary <= 18250) return 810.00;
        else if (monthlySalary <= 18750) return 832.50;
        else if (monthlySalary <= 19250) return 855.00;
        else if (monthlySalary <= 19750) return 877.50;
        else if (monthlySalary <= 20250) return 900.00;
        else if (monthlySalary <= 20750) return 922.50;
        else if (monthlySalary <= 21250) return 945.00;
        else if (monthlySalary <= 21750) return 967.50;
        else if (monthlySalary <= 22250) return 990.00;
        else if (monthlySalary <= 22750) return 1012.50;
        else if (monthlySalary <= 23250) return 1035.00;
        else if (monthlySalary <= 23750) return 1057.50;
        else if (monthlySalary <= 24250) return 1080.00;
        else if (monthlySalary <= 24750) return 1102.50;
        else return 1125.00;
    }

    // PhilHealth
    public static double computePhilHealth(double monthlySalary) {

        if (monthlySalary <= 10000)
            return 150.00;

        if (monthlySalary >= 60000)
            return 900.00;

        return (monthlySalary * 0.03) / 2;

    }

    // Pag-IBIG
    public static double computePagIBIG(double monthlySalary) {

        double contribution;

        if (monthlySalary <= 1500)
            contribution = monthlySalary * 0.01;
        else
            contribution = monthlySalary * 0.02;

        if (contribution > 100)
            contribution = 100;

        return contribution;

    }

    // Withholding Tax
    public static double computeWithholdingTax(double taxableIncome) {

        if (taxableIncome <= 20832)
            return 0;

        else if (taxableIncome < 33333)
            return (taxableIncome - 20833) * 0.20;

        else if (taxableIncome < 66667)
            return 2500 + ((taxableIncome - 33333) * 0.25);

        else if (taxableIncome < 166667)
            return 10833 + ((taxableIncome - 66667) * 0.30);

        else if (taxableIncome < 666667)
            return 40833.33 + ((taxableIncome - 166667) * 0.32);

        else
            return 200833.33 + ((taxableIncome - 666667) * 0.35);

    }

}