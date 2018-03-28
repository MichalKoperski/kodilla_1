package com.kodilla;

interface Employee {
    double calculateSalary();
}
class FixedSalaryEmployee implements Employee {
    private double salary;
    public FixedSalaryEmployee(double salary) {
        this.salary = salary;
    }
    public double calculateSalary() {
        return this.salary;
    }
}
class SalaryByProductEmployee implements Employee {
    private int products;
    private double byProductPay;
    public SalaryByProductEmployee (int products, double byProductPay) {
        this.products = products;
        this.byProductPay = byProductPay;
    }
    public double calculateSalary() {
        return this. byProductPay * this.products;
    }
}
class FixedSalaryPlusBonusEmployee implements Employee {
    private boolean isProductSold;
    private double fixedSalary;
    private double totalSalary;
    public FixedSalaryPlusBonusEmployee (boolean isProductSold, double fixedSalary) {
        this.isProductSold=isProductSold;
        this.fixedSalary=fixedSalary;
        this.totalSalary=totalSalary;
        if(isProductSold) {
            totalSalary=1.2*fixedSalary;
        }
    }
    public double calculateSalary() {
        return this.totalSalary;
    }
}
class HourlySalaryEmployee implements Employee {
    private double hours;
    private double hourlyPay;
    public HourlySalaryEmployee(double hours, double hourlyPay) {
        this.hours = hours;
        this.hourlyPay = hourlyPay;
    }
    public double calculateSalary() {
        return this.hourlyPay * this.hours;
    }
}
abstract class SalaryPayout {
    private Employee employee;
    public SalaryPayout(Employee employee) {
        this.employee = employee;
    }
    protected abstract void payout();
    public void processPayout() {
        System.out.println("Creating payout for: " + this.employee.calculateSalary() + " PLN");
        this.payout();
        System.out.println("Payout has been completed!");
    }
}
class SalaryPayoutProcessor extends SalaryPayout {
    public SalaryPayoutProcessor(Employee employee) {
        super(employee);
    }
    protected void payout() {
        System.out.println("Sending money to employee");
    }
}
class Application5 {
    public static void main(String args[]) {
        FixedSalaryEmployee employee = new FixedSalaryEmployee(2000);
        HourlySalaryEmployee employee1 = new HourlySalaryEmployee(40, 19);
        SalaryByProductEmployee employee2 = new SalaryByProductEmployee (10, 5);
        FixedSalaryPlusBonusEmployee employee3 = new FixedSalaryPlusBonusEmployee (true, 2000);

        SalaryPayoutProcessor processor = new SalaryPayoutProcessor(employee3);
        processor.processPayout();
    }
}
