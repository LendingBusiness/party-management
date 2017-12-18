package org.kd.repository;

import org.kd.model.Fund;
import org.kd.model.Party;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PartyRepository {

    PartyRepository() {
    }

    public List<Party> getAll() {
        List<Party> parties = new ArrayList<>();
        parties.add(new Party("GetinNoble", new Fund("Noble Bond Fund")));
        parties.add(new Party("PKO SA", new Fund("PKO Stock Fund")));
        return parties;
    }
}
