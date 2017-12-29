package org.kd.party;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kd.model.Fund;
import org.kd.model.Party;
import org.kd.party.service.PartyDemoService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
public class PartyManagementTests {

    @Test
    public void contextLoads() {
        String[] expectedParties = {"GetinNoble", "PKO SA"};
        String[] expectedFunds = {"Noble", "PKO"};

        ConfigurableApplicationContext context = SpringApplication.run(PartyManagement.class);
        Party[] parties = context.getBean(PartyDemoService.class).getAllParties();
        context.close();

        Assert.assertEquals(expectedParties.length, parties.length);

        for (int i = 0; i < parties.length; i++) {
            Assert.assertTrue(parties[i].getName().contains(expectedParties[i]));
            List<Fund> availableFunds = parties[i].getAvailableFunds();
            boolean fundFound = false;
            for (Fund availFund : availableFunds) {
                fundFound = availFund.getName().contains(expectedFunds[i]);
                if (fundFound) break;
            }
            Assert.assertTrue(fundFound);
        }


    }
}
