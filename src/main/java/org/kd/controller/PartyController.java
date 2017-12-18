package org.kd.controller;

import org.kd.model.Party;
import org.kd.repository.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
}
