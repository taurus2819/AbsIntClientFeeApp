package JavaInterfacesAbstraction_war.module1.interfaceclasses;

import JavaInterfacesAbstraction_war.module1.ClientEngagement;

public class InterfaceRevenuCalculatorRunner {

    public static void main(String[] args) {

        final ClientEngagement clientEngagement = new ClientEngagement("PLS",
                                                                            100,
                                                                            15_000);

        final InterfaceHourlyPriceCalculator hpc = new InterfaceHourlyPriceCalculator();
        System.out.println("Using Interface Class: Hourly Rate = " + hpc.priceCalculate(clientEngagement));

        final InterfaceHourlyPriceCalculator hpc1 = new InterfaceHourlyPriceCalculator(25);
        System.out.println("Using Interface Class: Hourly Rate = " + hpc1.priceCalculate(clientEngagement));

        final InterfaceFixedFeeCalculator ffc = new InterfaceFixedFeeCalculator();
        System.out.println("Using Interface class: Fixed fee = " + ffc.priceCalculate(clientEngagement));

        final InterfaceFixedFeeCalculator ffc1 = new InterfaceFixedFeeCalculator(200);
        System.out.println("Using Interface class: Fixed fee = " + ffc1.priceCalculate(clientEngagement));

        final InterfaceRoyaltyFeeCalculator rfc = new InterfaceRoyaltyFeeCalculator(InterfaceRoyaltyFeeCalculator.ROYALTY_FEE);
        System.out.println("Using Interface class: Royalty fee = " + rfc.priceCalculate(clientEngagement));

        //polymorphism

        RevenueCalculatorInterface rc = new InterfaceHourlyPriceCalculator(30);
        System.out.println("Using Interface class - Polymorphism : Hourly rate = " + rc.priceCalculate(clientEngagement));

        rc = new InterfaceFixedFeeCalculator(350);
        System.out.println("Using Interface class - Polymorphism : Fixed rate = " + rc.priceCalculate(clientEngagement));
    }
}

