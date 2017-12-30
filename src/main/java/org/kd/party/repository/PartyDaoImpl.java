package org.kd.party.repository;

import org.kd.model.Fund;
import org.kd.model.Party;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PartyDaoImpl implements PartyDao {

    private String SQL_QUERY;
    Connection con;
    ResultSet rs;
    PreparedStatement stmt;

    public Party[] getAll() {
        ArrayList<Party> countries = new ArrayList<>();
        SQL_QUERY = "SELECT * FROM Party";

        return (Party[]) countries.toArray();
    }

    @Override
    public Party getById(String id) throws SQLException {
        SQL_QUERY = "SELECT * FROM Party WHERE id=".concat(id);
        return null;
    }

    @Override
    public Party getByExternalId(String externalId) throws SQLException {
        SQL_QUERY = "SELECT * FROM Party WHERE externalId=".concat(externalId);
        return null;
    }

    @Override
    public boolean update(Party party) {
        return false;
    }

    @Override
    public boolean create(Party party) {
        SQL_QUERY = "INSERT INTO Party VALUES("
                .concat(party.getId())
                .concat(party.getExternalId())
                .concat(party.getName())
                .concat(concatFundNames(party.getAvailableFunds()));
        return true;
    }

    private String concatFundNames(List<Fund> funds) {
        StringBuilder concatenaded = new StringBuilder(funds.size());
        Iterator<Fund> fundIterator = funds.iterator();

        while (fundIterator.hasNext()) {
            concatenaded.append(fundIterator.next().getName().concat(" ,"));
        }

        return concatenaded.toString();
    }

    public String getSQL_QUERY() {
        return SQL_QUERY;
    }
}
