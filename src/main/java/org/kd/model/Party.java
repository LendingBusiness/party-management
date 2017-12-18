package org.kd.model;

public class Party {
    private String name;
    private Fund fund;

    public Party() {
    }

    public Party(String name, Fund fund) {
        this.name = name;
        this.fund = fund;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fund getFund() {
        return fund;
    }

    public void setFund(Fund fund) {
        this.fund = fund;
    }

    @Override
    public String toString() {
        return "Party{" +
                "name='" + name + '\'' +
                ", fund=" + fund +
                '}';
    }
}
