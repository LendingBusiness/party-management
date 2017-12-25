package org.kd.party.repository;

import java.util.ArrayList;
import java.util.List;
import org.kd.model.Fund;

public class FundFactory {

    private static int counter = 0;

    private static final Fund[] PREDEFINED_FUNDS = {
            new Fund("Noble Fund", 100),
            new Fund("PKO TFI", 90),
            new Fund("Allianz", 100),
            new Fund("UBS", 190),
            new Fund("PKO TFI Fund", 390),
            new Fund("Allianz", 1200),
            new Fund("UBS", 800),
            new Fund("PZU Fund", 190),
            new Fund("BZWBK Fund", 390)
    };

    public static Fund createFund() {
        return PREDEFINED_FUNDS[counter++ % PREDEFINED_FUNDS.length];
    }

    public static List<Fund> createFunds(int amount) {
        List<Fund> funds = new ArrayList<>(amount);
        for (int i = 0; i < amount; i++) {
            funds.add(createFund());
        }
        return funds;
    }
}
