package org.kd;

import org.junit.Assert;
import org.junit.Test;
import org.kd.model.Party;
import org.kd.service.PartyDemoService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class PartyManagementTests {

    @Test
    public void contextLoads() {
        String[] expectedParties = {"GetinNoble", "PKO SA"};
        String[] expectedFunds = {"Noble", "PKO"};

        ConfigurableApplicationContext context = SpringApplication.run(PartyManagement.class);
        Party[] parties = context.getBean(PartyDemoService.class).getAllParties();

        Assert.assertEquals(expectedParties.length, parties.length);

        for (int i = 0; i < parties.length; i++) {
            Assert.assertTrue(parties[i].getName().contains(expectedParties[i]));
            Assert.assertTrue(parties[i].getFund().getName().contains(expectedFunds[i]));
        }

        context.close();
    }
}
