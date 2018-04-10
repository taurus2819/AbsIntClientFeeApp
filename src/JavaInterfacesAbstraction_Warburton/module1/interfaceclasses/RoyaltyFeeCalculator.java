package JavaInterfacesAbstraction_Warburton.module1.interfaceclasses;

import JavaInterfacesAbstraction_Warburton.module1.ClientEngagement;

public class RoyaltyFeeCalculator implements RevenueCalculator {

    public static final double ROYALTY_FEE = 0.15;
    private final double royaltyFee;

    public RoyaltyFeeCalculator(double royaltyFee) {
        this.royaltyFee = royaltyFee;
    }

    @Override
    public double priceCalculate(ClientEngagement clientEngagement) {
        return royaltyFee * clientEngagement.getAnticipatedRevenue();
    }
}
