package Task1_SRP;

public class SalaryCalculator {
    private int baseSalary;

    public SalaryCalculator(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);
        return baseSalary - tax;
    }
}