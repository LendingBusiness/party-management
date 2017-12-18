package org.kd.repository;

public class PartyDto {

    private final String fundName;
    private final String countryName;

    PartyDto(String countryName, String fundName) {
        this.fundName = fundName;
        this.countryName = countryName;
    }
}
