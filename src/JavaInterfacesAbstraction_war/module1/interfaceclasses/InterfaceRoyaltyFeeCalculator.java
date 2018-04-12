package JavaInterfacesAbstraction_war.module1.interfaceclasses;

import JavaInterfacesAbstraction_war.module1.ClientEngagement;

public class InterfaceRoyaltyFeeCalculator implements RevenueCalculatorInterface {

    public static final double ROYALTY_FEE = 0.15;
    private final double royaltyFee;

    public InterfaceRoyaltyFeeCalculator(){this.royaltyFee = ROYALTY_FEE;}

    public InterfaceRoyaltyFeeCalculator(double royaltyFee) {
        this.royaltyFee = royaltyFee;
    }

    @Override
    public double priceCalculate(ClientEngagement clientEngagement) {
        return royaltyFee * clientEngagement.getAnticipatedRevenue();
    }
}
