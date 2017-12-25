package org.kd.party.service;

import org.kd.model.Party;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.logging.Logger;

@Service
public class PartyDemoService {

    private static final Logger logger = Logger.getLogger(PartyDemoService.class.getName());
    @Autowired
    private RestTemplate partyRestTemplate;

    public void printAllParties() {
        Arrays.stream(getAllParties()).forEach(System.out::println);
    }

    public void printFirstParty() {
        Party party = getFirstParty();
        logger.info(party.getName());
    }

    public Party[] getAllParties() {
        return partyRestTemplate.getForObject("/parties", Party[].class);
    }

    public Party getFirstParty() {
        return partyRestTemplate.getForObject("/party/0", Party.class);
    }


}
