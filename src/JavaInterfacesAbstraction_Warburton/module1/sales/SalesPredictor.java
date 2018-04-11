package JavaInterfacesAbstraction_Warburton.module1.sales;

import JavaInterfacesAbstraction_Warburton.module1.ClientEngagement;
import JavaInterfacesAbstraction_Warburton.module1.interfaceclasses.InterfaceFixedFeeCalculator;
import JavaInterfacesAbstraction_Warburton.module1.interfaceclasses.InterfaceHourlyPriceCalculator;
import JavaInterfacesAbstraction_Warburton.module1.interfaceclasses.InterfaceRoyaltyFeeCalculator;
import JavaInterfacesAbstraction_Warburton.module1.interfaceclasses.RevenueCalculatorInterface;

import java.util.ArrayList;
import java.util.List;

public class SalesPredictor {

    public static void main(String[] args) {

        final List<ClientEngagement> engagements = new ArrayList<>();
        engagements.add(new ClientEngagement("Starbucks", 40, 40_000));
        engagements.add(new ClientEngagement("Mojo", 30, 10_000));
        engagements.add(new ClientEngagement("ChaiWorks", 25, 1000));
        engagements.add(new ClientEngagement("Macs", 10, 2000));

        System.out.println("Total hourly fee");
        printTotalRevenue(engagements, new InterfaceHourlyPriceCalculator());

        System.out.println("Total fixed fee");
        printTotalRevenue(engagements, new InterfaceFixedFeeCalculator());

        System.out.println("Total Royalty fee");
        printTotalRevenue(engagements, new InterfaceRoyaltyFeeCalculator());
    }

    private static void printTotalRevenue(List<ClientEngagement> engagements, RevenueCalculatorInterface calculator) {

        double total = 0.0;
        for(ClientEngagement clientWork : engagements){
            total += calculator.priceCalculate(clientWork);
        }
        System.out.println("$ " + total);
    }
}
