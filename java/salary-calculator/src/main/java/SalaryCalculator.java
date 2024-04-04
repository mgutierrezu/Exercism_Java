public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double factor;
        return factor = (daysSkipped >= 5) ? 0.85 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        int factor;
        return factor = (productsSold >= 20) ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        double bonus;
        return bonus = (bonusMultiplier(productsSold) == 13) ? (13 * productsSold) : (10 * productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double total;
        double baseSalary = 1000.00;
        return total = ((baseSalary * salaryMultiplier(daysSkipped)) + bonusForProductsSold(productsSold) >= 2000) ? 2000 : ((baseSalary * salaryMultiplier(daysSkipped)) + bonusForProductsSold(productsSold));
    }
}
