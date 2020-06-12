package ch.aprentas.applikationslogik;

public class Medium {

    private int altersfreigabe;

    private String genre;

    private int id;

    private String interpret;

    private int isbn;

    private String standortCode;

    private String titel;

    public Medium() {

    }

    // GETTERS AND SETTERS

    public int getAltersfreigabe() {
        return altersfreigabe;
    }

    public void setAltersfreigabe(int altersfreigabe) {
        this.altersfreigabe = altersfreigabe;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInterpret() {
        return interpret;
    }

    public void setInterpret(String interpret) {
        this.interpret = interpret;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getStandortCode() {
        return standortCode;
    }

    public void setStandortCode(String standortCode) {
        this.standortCode = standortCode;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
}
