package JavaInterfacesAbstraction_Warburton.module1.abstractclasses;

import JavaInterfacesAbstraction_Warburton.module1.ClientEngagement;

public class RoyaltyFeeCalculator extends RevenueCalculator {

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
