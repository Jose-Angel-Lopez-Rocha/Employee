//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BasePlusCommissionEmploye basePlusCommissionEmploye1=new BasePlusCommissionEmploye("Jose", "Gonzalez", "42342", 1000,0.2,2000);
        System.out.println("Nombre: " +basePlusCommissionEmploye1.getFirstName());
        System.out.println("Apellido: " +basePlusCommissionEmploye1.getLastName());
        System.out.println("Numero seguridad social: " + basePlusCommissionEmploye1.getSocialSecurityNumber());
        System.out.println("Salario base: " + basePlusCommissionEmploye1.getBaseSalary());
        System.out.println("Pago base: " + basePlusCommissionEmploye1.getGrossSales());
        System.out.println("Pago final: " + basePlusCommissionEmploye1.earnings());
        }
    }