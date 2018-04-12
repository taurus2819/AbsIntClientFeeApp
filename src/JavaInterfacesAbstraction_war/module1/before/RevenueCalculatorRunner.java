package JavaInterfacesAbstraction_war.module1.before;

import JavaInterfacesAbstraction_war.module1.ClientEngagement;

public class RevenueCalculatorRunner {

    public static void main(String[] args) {

        final ClientEngagement clientEngagement =
                new ClientEngagement("P" +
                        "PlS", 100, 15_000);

        //hourly
        final double hourlyprice = RevenueCalculator.price("Hourly", clientEngagement);
        System.out.println("Hourly price = " + hourlyprice);

        //fixed fee
        final double fixedFeePrice = RevenueCalculator.price("FixedFee", clientEngagement);
        System.out.println("Fixed Fee Price= " + fixedFeePrice);

        //Royalty Percentage
        final double royaltyPercentagePrice = RevenueCalculator.price("RoyaltyPercentage", clientEngagement);
        System.out.println("Royalty Percentage Price = " + royaltyPercentagePrice);

    }
}
