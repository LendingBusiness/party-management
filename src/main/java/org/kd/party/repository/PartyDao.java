package org.kd.party.repository;

import org.kd.model.Party;

import java.sql.SQLException;

public interface PartyDao {
     Party[] findAll() throws SQLException;
}
