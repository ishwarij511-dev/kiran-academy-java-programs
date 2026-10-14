
public class ElectricityBillCalculator {

    public static double calculateEnergyCharge(double units) {
        if (units <= 100) {
            return units * 3.00;
        } else if (units <= 200) {
            return (100 * 3.00) + ((units - 100) * 5.00);
        } else {
            return (100 * 3.00) + (100 * 5.00)
                    + ((units - 200) * 7.00);
        }
    }

    public static double calculateFixedCharge() {
        return 50.00;
    }

    public static double calculateTax(double energyCharge,
                                      double fixedCharge) {
        double subtotal = energyCharge + fixedCharge;
        return subtotal * 5 / 100;
    }

    public static double calculateTotalBill(double units) {
        double energyCharge = calculateEnergyCharge(units);
        double fixedCharge = calculateFixedCharge();
        double tax = calculateTax(energyCharge, fixedCharge);

        return energyCharge + fixedCharge + tax;
    }

    public static void main(String[] args) {
        double units = 250;

        double energyCharge = calculateEnergyCharge(units);
        double fixedCharge = calculateFixedCharge();
        double tax = calculateTax(energyCharge, fixedCharge);
        double totalBill = calculateTotalBill(units);

        System.out.printf("Units consumed: %.0f%n", units);
        System.out.printf("Energy charge: Rs. %.2f%n", energyCharge);
        System.out.printf("Fixed charge: Rs. %.2f%n", fixedCharge);
        System.out.printf("Tax (5%%): Rs. %.2f%n", tax);
        System.out.printf("Total electricity bill: Rs. %.2f%n", totalBill);
    }
}
