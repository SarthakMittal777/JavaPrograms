package employee;

public class Sarthak_employee_payroll_process {
    public String name;
    public int emp_id;
    public String category;
    public double basic_pay;
    public double hra;
    public double da;
    public double net_pay;
    public double PF;
    public double gross_pay;
    public double income_tax;
    public double allowance;

    // Constructor
    public  Sarthak_employee_payroll_process(String name, int emp_id, String category, double basic_pay, double hra, double da) {
        this.name = name;
        this.emp_id = emp_id;
        this.category = category;
        this.basic_pay = basic_pay;
        this.hra = hra;
        this.da = da;
    }

    // Method to calculate gross pay
    public void calculateGrossPay() {
        gross_pay = basic_pay + hra + da;
    }

    // Method to calculate PF
    public void calculatePF() {
        PF = 0.12 * basic_pay;
    }

    // Method to calculate income tax
    public void calculateIncomeTax() {
        if (gross_pay <= 500000) {
            income_tax = 0;
        } else if (gross_pay <= 1000000) {
            income_tax = 0.1 * gross_pay;
        } else {
            income_tax = 0.2 * gross_pay;
        }
    }

    // Method to calculate net pay
    public void calculateNetPay() {
        net_pay = gross_pay - (PF + income_tax);
    }

    // Method to calculate allowance
    public void calculateAllowance() {
        allowance = 0.1 * basic_pay;
    }

    // Method to print employee details and pay
    public void printPayrollDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Category: " + category);
        System.out.println("Basic Pay: " + basic_pay);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);

        calculateGrossPay();
        calculatePF();
        calculateIncomeTax();
        calculateNetPay();
        calculateAllowance();

        System.out.println("\nPayroll Details:");
        System.out.println("Gross Pay: " + gross_pay);
        System.out.println("PF: " + PF);
        System.out.println("Income Tax: " + income_tax);
        System.out.println("Net Pay: " + net_pay);
        System.out.println("Allowance: " + allowance);
    }
}
