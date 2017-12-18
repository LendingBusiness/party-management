package org.kd.repository;

import org.kd.model.Fund;
import org.kd.model.Party;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PartyRepository {

    private List<Party> parties = new ArrayList<>();

    PartyRepository() {
        parties.add(new Party("GetinNoble", new Fund("Noble Bond Fund")));
        parties.add(new Party("PKO SA", new Fund("PKO Stock Fund")));

    }

    public List<Party> getAll() {

        return parties;
    }

    public void postParty(String name){
        parties.add(new Party(name, new Fund("Undefined Fund")));
    }
}
