package JavaInterfacesAbstraction_war.module1.interfaceclasses;

import JavaInterfacesAbstraction_war.module1.ClientEngagement;

public class InterfaceFixedFeeCalculator implements RevenueCalculatorInterface {

    private static final double FIXED_FEE = 500;
    private final double fixedFee;

    public InterfaceFixedFeeCalculator(){
        this.fixedFee = FIXED_FEE;
    }

    public InterfaceFixedFeeCalculator(final double fixedFee) {
        this.fixedFee = fixedFee;
    }

    @Override
    public double priceCalculate(ClientEngagement clientEngagement) {
        return fixedFee ;
    }
}
