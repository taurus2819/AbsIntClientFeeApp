package JavaInterfacesAbstraction_Warburton.module1.interfaceclasses;

import JavaInterfacesAbstraction_Warburton.module1.ClientEngagement;

public class HourlyPriceCalculator implements RevenueCalculator {

    private static final double HOURLY_PRICE = 50;
    private final double hourlyPrice;

    public HourlyPriceCalculator() {
        this.hourlyPrice = HOURLY_PRICE;
    }

    public HourlyPriceCalculator(final double hourlyPrice){
        this.hourlyPrice = hourlyPrice;
    }

    @Override
    public double priceCalculate(ClientEngagement clientEngagement) {
        return hourlyPrice * clientEngagement.getHoursWorked();
    }
}
