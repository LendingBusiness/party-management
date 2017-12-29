package org.kd.party.service;

import org.kd.model.Party;
import org.kd.party.repository.PartyDto;
import org.kd.party.repository.PartyRepository;

import java.util.Collection;

public class PartyManagemetServiceImpl implements PartyManagementService{

    private PartyRepository partyRepository;

    @Override
    public Collection<Party> getPartiesByExternalReference(String partyExtRef) {

        //Collection<PartyDto> parties = partyRepository.getAll();
        return null;
    }
}
