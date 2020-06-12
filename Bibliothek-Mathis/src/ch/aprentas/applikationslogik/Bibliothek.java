package ch.aprentas.applikationslogik;

import ch.aprentas.datenschicht.KundeDAO;
import ch.aprentas.dto.KundeDTO;

import java.util.ArrayList;

public class Bibliothek {

    ArrayList<Kunde> kunden = new ArrayList<Kunde>();

    ArrayList<Medium> medien = new ArrayList<Medium>();

    Umwandler umwandler = new Umwandler();

    public Bibliothek() {

    }

    public Kunde kundeSuchen(int kundenId) {

        return null;
    }

    public Kunde kundeSuchen(String vorname, String nachname, String strasse, int strassenNummer) {

        KundeDAO kundeDAO = new KundeDAO();

        Kunde kunde = umwandler.convertKundeDtoToKunde(kundeDAO.getKunde(vorname, nachname, strasse, strassenNummer));

        return kunde;
    }

    public void aufraeumen() throws Exception {
        KundeDAO kundeDAO = new KundeDAO();
        kundeDAO.aufraeumen();
    }

    public ArrayList<Kunde> getKunden() {
        return kunden;
    }

    public void setKunden(ArrayList<Kunde> kunden) {
        this.kunden = kunden;
    }

    public ArrayList<Medium> getMedien() {
        return medien;
    }

    public void setMedien(ArrayList<Medium> medien) {
        this.medien = medien;
    }
}
