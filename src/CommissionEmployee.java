public class CommissionEmployee extends Employee {
    private double grossSales;
    private double CommissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.setCommissionRate(commissionRate);
    }
    public double getGrossSales() {
        return grossSales;
    }
    public double getCommissionRate() {
        return CommissionRate;
    }
    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }
    public void setCommissionRate(double commissionRate) {
        CommissionRate = commissionRate;
    }
    public double earnings(){
        return CommissionRate*grossSales;
    }
}