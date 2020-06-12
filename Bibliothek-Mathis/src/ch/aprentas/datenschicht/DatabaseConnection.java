package ch.aprentas.datenschicht;

import ch.aprentas.dto.KundeDTO;

import java.sql.*;
import java.util.ArrayList;

/**
 * Singleton - verwaltet die Datenbankverbingung
 */
public final class DatabaseConnection {

    private static DatabaseConnection databaseConnection = null;

    private Connection connection;

    private DatabaseConnection() throws Exception {
        // Datenhaltungsschicht - Erzeugung der Connection (Singleton)
        // Verbindung (connection) zur DB aufbauen
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        connection = DriverManager.getConnection(
                "jdbc:postgresql://192.168.56.102:5432/Bibliothek","postgres", "julian");
    }

    public static DatabaseConnection getDbConnection() throws Exception {
        if (databaseConnection == null) {
            databaseConnection = new DatabaseConnection();
        }
        return databaseConnection;
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeDatabaseConnection() throws SQLException {
        if (connection != null) {
            connection.close();
            connection = null;
        }
    }
}
