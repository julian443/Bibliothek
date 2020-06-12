package ch.aprentas.datenschicht;

import ch.aprentas.dto.KundeDTO;
import ch.aprentas.dto.MediumDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * Datenhaltungsschicht
 * Teil von der  Fasssade zur Applikationslogik (Schicht)
 * kapselt die nach oben zur Verfuegung gestellte Funktionalitaet
 */
public class KundeDAO {
/**
    public ArrayList<KundeDTO> getAllKunden() {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.getAllKunden();

    }
*/

    public void aufraeumen() throws Exception {
        DatabaseConnection.getDbConnection().closeDatabaseConnection();
    }

    /**
     * Holt alle Kunden aus der Datenbank
     * @return alle Kunden in einer Liste
     */
    public KundeDTO getKunde(String vorname, String nachname, String strasse, int strassenNummer) {
        KundeDTO kunde = new KundeDTO();
        try {
            Connection con = DatabaseConnection.getDbConnection().getConnection();

            // Datenhaltungsschicht - DAO
            // Abfrage vorbereiten und durchfuehren
            PreparedStatement stmt = con.prepareStatement(
                    "select * from kunde where name = ?");
            stmt.setString(1, nachname);
            ResultSet rs = stmt.executeQuery();

            // TODO Umformen und Durchreichen an die Anwendungsschicht
            while (rs.next()) {
                System.out.println(rs.getString(1));
                kunde = new KundeDTO();
                kunde.setName(rs.getString(1));
            }



        } catch (Exception e) {
            e.printStackTrace();
        }

        return kunde;
    }


}
