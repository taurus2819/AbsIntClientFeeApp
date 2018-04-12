package JavaInterfacesAbstraction_war.module1.interfaceclasses;

import JavaInterfacesAbstraction_war.module1.ClientEngagement;

public class InterfaceHourlyPriceCalculator implements RevenueCalculatorInterface {

    private static final double HOURLY_PRICE = 50;
    private final double hourlyPrice;

    public InterfaceHourlyPriceCalculator() {
        this.hourlyPrice = HOURLY_PRICE;
    }

    public InterfaceHourlyPriceCalculator(final double hourlyPrice){
        this.hourlyPrice = hourlyPrice;
    }

    @Override
    public double priceCalculate(ClientEngagement clientEngagement) {
        return hourlyPrice * clientEngagement.getHoursWorked();
    }
}
