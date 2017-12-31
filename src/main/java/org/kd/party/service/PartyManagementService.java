package org.kd.party.service;

import org.kd.model.Party;

import java.util.Collection;

public interface PartyManagementService {

    Collection<Party> getPartiesByExternalReference(String partyExtRef);
}
