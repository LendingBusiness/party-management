package org.kd.party.config;

import org.kd.model.Fund;
import org.kd.model.Party;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class TestPartyMgmtAppConfig extends PartyMgmtAppConfig {

    @Bean(name = "testFund1")
    public Fund createTestFund1() {
        return new Fund("BlackRock UK Equity Tracker", 153233);
    }

    @Bean(name = "testFund2")
    public Fund createTestFund2() {
        return new Fund("Woodford Equity Income", 33233);
    }

    @Bean
    public Party createTestParty1() {
        Fund testF1 = createTestFund1();
        Fund testF2 = createTestFund2();

        return new Party("Union Bank of Switzerland", Arrays.asList(
                testF1, testF2));

    }

}