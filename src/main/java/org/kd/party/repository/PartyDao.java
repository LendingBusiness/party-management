package org.kd.party.repository;

import org.kd.model.Party;

import java.sql.SQLException;

public interface PartyDao {
     Party[] getAll() throws SQLException;
     Party getById(String id) throws SQLException;
     Party getByExternalId(String externalId) throws SQLException;
     boolean update(Party party);
     boolean create(Party party);
}
