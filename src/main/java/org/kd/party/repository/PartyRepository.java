package org.kd.party.repository;

import org.kd.model.Party;
import org.kd.repository.LegalEntityRepository;
import org.kd.service.LendingRequestWrapper;
import org.kd.service.ServiceRegistry;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public final class PartyRepository implements LegalEntityRepository {

    private List<Party> parties = new ArrayList<>();

    private LendingRequestWrapper fundMgmtRequestWrapper;

    public PartyRepository() {
        init();
    }

    public void init() {
        fundMgmtRequestWrapper = new LendingRequestWrapper(ServiceRegistry.AppName.FUND_MANAGEMENT, "");
        fundMgmtRequestWrapper.sendRequest(HttpMethod.GET, "", "/funds");
        parties.add(new Party("GetinNoble", TestFundFactory.createFunds(2)));
        parties.add(new Party("PKO SA", TestFundFactory.createFunds(8)));
    }

    public List<Party> getAll() {
        return parties;
    }

    public void create(String name) {
        parties.add(new Party(name, TestFundFactory.createFunds(4)));
    }
}
