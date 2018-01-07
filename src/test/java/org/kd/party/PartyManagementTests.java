package org.kd.party;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kd.model.Fund;
import org.kd.model.Party;
import org.kd.party.service.PartyDemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
public class PartyManagementTests {

    private static final Logger logger = LoggerFactory.getLogger(PartyManagementTests.class);

    @Test
    public void contextLoads() {
        String[] expectedParties = {"GetinNoble", "PKO SA"};
        String[] expectedFunds = {"Noble Fund", "PKO TFI"};

        PartyManagement.main(new String[0]);
        ConfigurableApplicationContext context = PartyManagement.getContext();
        Party[] parties = context.getBean(PartyDemoService.class).getAllParties();

        try {
            Assert.assertEquals(expectedParties.length, parties.length);
        } catch (AssertionError e) {
            logger.error("Error reading parties");
            context.close();
            throw new AssertionError(e);
        }
        for (int i = 0; i < parties.length; i++) {
            try {
                Assert.assertTrue(parties[i].getName().contains(expectedParties[i]));
                List<Fund> availableFunds = parties[i].getAvailableFunds();
                boolean fundFound = false;
                for (Fund availFund : availableFunds) {
                    fundFound = availFund.getName().contains(expectedFunds[i]);
                    if (fundFound) break;
                }
                Assert.assertTrue(fundFound);
            } catch (AssertionError e) {
                logger.error(e.getLocalizedMessage());
                context.close();
            }
        }
        context.close();
    }
}
