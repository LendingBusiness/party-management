package org.kd.party;

import org.kd.model.LendingRestApp;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PartyManagement extends LendingRestApp {

    public static void main(String[] args) {
        PartyManagement.start(PartyManagement.class);
    }

}
