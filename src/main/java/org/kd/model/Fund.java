package org.kd.model;

public class Fund {
    private String name;

    public Fund() {
    }

    public Fund(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fund{" + "name='" + name + '\'' + '}';
    }
}
