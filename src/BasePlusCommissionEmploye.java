public class BasePlusCommissionEmploye extends  CommissionEmployee{
    private double baseSalary;
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public BasePlusCommissionEmploye(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }
    @Override
    public double earnings() {
        return super.earnings()+baseSalary;
    }
}

