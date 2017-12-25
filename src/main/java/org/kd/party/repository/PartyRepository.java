package org.kd.party.repository;

import org.kd.model.Party;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PartyRepository {

    private List<Party> parties = new ArrayList<>();

    PartyRepository() {
        parties.add(new Party("GetinNoble", FundFactory.createFunds(2)));
        parties.add(new Party("PKO SA", FundFactory.createFunds(8)));

    }

    public List<Party> getAll() {
        return parties;
    }

    public void postParty(String name) {
        parties.add(new Party(name, FundFactory.createFunds(4)));
    }
}
