package org.kd.party.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kd.model.Fund;
import org.kd.model.Party;
import org.kd.party.config.TestAppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.springframework.util.Assert.isTrue;

@RunWith(SpringJUnit4ClassRunner.class)
public class PartyDaoImplTests {

    @Test
    public void partyDaoCreationTest(){
        PartyDaoImpl partyDao = new PartyDaoImpl();
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TestAppConfig.class);

        Fund expectedFund1 = ctx.getBean("testFund1", Fund.class);
        Fund expectedFund2 = ctx.getBean("testFund2", Fund.class);

        Party ubsParty = ctx.getBean(Party.class);

        if (partyDao.create(ubsParty)){
            isTrue(partyDao.getSQL_QUERY().contains(expectedFund1.getName()), expectedFund1.getName().concat(" not found in available funds list - problems with dao creation"));
            isTrue(partyDao.getSQL_QUERY().contains(expectedFund2.getName()), expectedFund1.getName().concat(" not found in available funds list - problems with dao creation"));
        }

    }
}
