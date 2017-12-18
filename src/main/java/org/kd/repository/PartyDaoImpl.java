package org.kd.repository;

import org.kd.model.Party;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PartyDaoImpl implements PartyDao {

    Connection con;
    ResultSet rs;
    PreparedStatement stmt;

    public Party[] findAll() {
        ArrayList<Party> countries = new ArrayList<>();
        final String SQL_QUERY = "Select * from Party";

        return (Party[])countries.toArray();
    }
}
