package JavaInterfacesAbstraction_war.module1.abstractclasses;

import JavaInterfacesAbstraction_war.module1.ClientEngagement;

public class FixedFeeCalculator extends RevenueCalculator {

    private static final double FIXED_FEE = 500;
    private final double fixedFee;

    public FixedFeeCalculator(){
        this.fixedFee = FIXED_FEE;
    }

    public FixedFeeCalculator(final double fixedFee) {
        this.fixedFee = fixedFee;
    }

    @Override
    public double priceCalculate(ClientEngagement clientEngagement) {
        return fixedFee ;
    }
}
