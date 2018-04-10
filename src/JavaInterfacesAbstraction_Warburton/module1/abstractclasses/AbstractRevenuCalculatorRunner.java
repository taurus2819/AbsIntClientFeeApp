package JavaInterfacesAbstraction_Warburton.module1.abstractclasses;

import JavaInterfacesAbstraction_Warburton.module1.ClientEngagement;

public class AbstractRevenuCalculatorRunner {

    public static void main(String[] args) {

        final ClientEngagement clientEngagement = new ClientEngagement("Pluralsight",
                                                                            100,
                                                                            15_000);

        final HourlyPriceCalculator hpc = new HourlyPriceCalculator();
        System.out.println("Using Abstract Class: Hourly Rate = " + hpc.priceCalculate(clientEngagement));

        final HourlyPriceCalculator hpc1 = new HourlyPriceCalculator(25);
        System.out.println("Using Abstract Class: Hourly Rate = " + hpc1.priceCalculate(clientEngagement));

        final FixedFeeCalculator ffc = new FixedFeeCalculator();
        System.out.println("Using Abstract class: Fixed fee = " + ffc.priceCalculate(clientEngagement));

        final FixedFeeCalculator ffc1 = new FixedFeeCalculator(200);
        System.out.println("Using Abstract class: Fixed fee = " + ffc1.priceCalculate(clientEngagement));

        final RoyaltyFeeCalculator rfc = new RoyaltyFeeCalculator(RoyaltyFeeCalculator.ROYALTY_FEE);
        System.out.println("Using Abstract class: Royalty fee = " + rfc.priceCalculate(clientEngagement));

        //polymorphism

        RevenueCalculator rc = new HourlyPriceCalculator(30);
        System.out.println("Using Abstreact class - Polymorphism : Hourly rate = " + rc.priceCalculate(clientEngagement));

        rc = new FixedFeeCalculator(350);
        System.out.println("Using Abstreact class - Polymorphism : Fixed rate = " + rc.priceCalculate(clientEngagement));
    }
}
