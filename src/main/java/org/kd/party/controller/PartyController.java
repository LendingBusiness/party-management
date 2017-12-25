package org.kd.party.controller;

import org.kd.party.PartyManagement;
import org.kd.model.Party;
import org.kd.party.repository.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PartyController {

    @Autowired
    private PartyRepository partyRepository;

    @GetMapping("/parties")
    public List<Party> getAll() {
        return partyRepository.getAll();
    }

    @GetMapping("/party/{partyId}")
    public Party getSingle(@PathVariable String partyId) {
        return partyRepository.getAll().get(Integer.valueOf(partyId));
    }

    @GetMapping("/exit")
    public void exitApplication() {
        PartyManagement.getContext().close();
    }

    @PostMapping("/postParty/{partyId}")
    public void postParty(@PathVariable String partyId) {
        partyRepository.postParty(partyId);
    }
}
