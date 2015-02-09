/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soaproject;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author neilkenney
 */
public interface DBAccessor {

    void closeConnection() throws SQLException;

    void createRecord(String tableName, List colNames, List colValues);

    void deleteRecord(String tableName, String colName, Object colValue);

    Connection getConn();

    void openConnection(String driverClass, String url, String user, String password) throws SQLException;

    List readRecords(String sqlString) throws SQLException;

    void setConn(Connection conn);

    void updateRecord(String tablename, String colName, String colValue, String colEqualName, String colEqualValue);
    
}
