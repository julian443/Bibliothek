package ch.aprentas.praesentationsschicht;

import ch.aprentas.applikationslogik.Bibliothek;

import java.util.Scanner;

public class Konsole {

    private int numberNav;

    private Scanner sc;

    Bibliothek bibliothek = new Bibliothek();

    public void startProgram() throws Exception {
        System.out.println("Guten Tag, was wollen Sie tun?");
        System.out.println("[0] (Ausser Betrieb) Medium ausleihen");
        System.out.println("[1] (Ausser Betrieb) Medium zurueckgeben");
        System.out.println("[2] Kunde suchen");

        setSc(new Scanner(System.in));
        setNumberNav(getSc().nextInt());

        switch (getNumberNav()) {
            case 0:
            case 1:
                System.out.println("Dieser Dienst ist momentan ausser Betrieb!");
                startProgram();
                break;
            case 2:
                System.out.println("Haben Sie die kundenId? ( Ja / Nein )");
                if (sc.nextLine().toLowerCase().equals("ja")) {
                    System.out.println("Wie lautet diese?");
                    bibliothek.kundeSuchen(sc.nextInt());
                } else if (sc.nextLine().toLowerCase().equals("nein")) {
                    System.out.println("Was ist der Vorname des Kunden?");
                    String vorname = sc.nextLine();
                    if (vorname.equals("")) {
                        System.out.println("Ungueltige Eingabe");
                    }
                    System.out.println("Was ist der Nachname des Kunden?");
                    String nachname = sc.nextLine();
                    if (nachname.equals("")) {
                        System.out.println("Ungueltige Eingabe");
                    }
                    System.out.println("Was ist die Adresse des Kunden?");
                    String strasse = sc.nextLine();
                    if (strasse.equals("")) {
                        System.out.println("Ungueltige Eingabe");
                    }
                    System.out.println("Was ist die Hausnummer des Kunden?");
                    int hausnummer = sc.nextInt();
                    bibliothek.kundeSuchen(vorname, nachname, strasse, hausnummer);
                    if(bibliothek.kundeSuchen(vorname, nachname, strasse, hausnummer) != null) {
                        System.out.println("Der Benutzer existert");
                        bibliothek.aufraeumen();
                    } else {
                        System.out.println("Der Benutzer existiert nicht! ");
                        bibliothek.aufraeumen();
                    }
                }
                break;

        }
    }


    // GETTERS AND SETTERS

    public int getNumberNav() {
        return numberNav;
    }

    public void setNumberNav(int numberNav) {
        this.numberNav = numberNav;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
}
